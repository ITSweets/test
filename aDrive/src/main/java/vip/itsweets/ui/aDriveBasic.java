package vip.itsweets.ui;

import io.qt.QtInvokable;
import io.qt.core.*;
import io.qt.gui.*;
import io.qt.widgets.QGraphicsDropShadowEffect;
import io.qt.widgets.QWidget;
import vip.itsweets.constant.aDriveCommon;


public class aDriveBasic extends QWidget
{

    private QPoint mousePoint;
    private Boolean mousePressed;
    private QPropertyAnimation driveQuitAnimation;
    private QGraphicsDropShadowEffect driveDropShadow;
    private QPropertyAnimation driveMinimizeAnimation;
    private QPropertyAnimation driveMinimizeToNormalAnimation;
    private QPropertyAnimation driveMaximizeAnimation;
    private QPropertyAnimation driveMaximizeToNormalAnimation;

    private Integer screenWidth;
    private Integer screenHeight;

    private UI_aDriveBasic ui;



    public aDriveBasic()
    {
        initInstance();
        initUI();
        initSignalSlot();
    }


    private void initInstance()
    {
        ui = new UI_aDriveBasic();
        ui.setupUi(this);

        mousePoint = new QPoint();
        mousePressed = false;
        driveQuitAnimation = new QPropertyAnimation(this, "windowOpacity", this);
        driveDropShadow = new QGraphicsDropShadowEffect(this);
        driveMinimizeAnimation = new QPropertyAnimation(this, "windowOpacity", this);
        driveMinimizeToNormalAnimation = new QPropertyAnimation(this, "windowOpacity", this);
        driveMaximizeAnimation = new QPropertyAnimation(this, "geometry", this);
        driveMaximizeToNormalAnimation = new QPropertyAnimation(this, "geometry", this);

        screenWidth = QGuiApplication.screens().at(0).geometry().width();
        screenHeight = QGuiApplication.screens().at(0).geometry().height();

    }


    private void initUI()
    {
        setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground, true);
        setWindowFlag(Qt.WindowType.FramelessWindowHint);
        installEventFilter(this);


        QFile driveBasicStyleFile = new QFile(":/style/aDriveBasic.css");
        driveBasicStyleFile.open(QIODevice.OpenModeFlag.ReadOnly);
        setStyleSheet(String.valueOf(driveBasicStyleFile.readAll()));
        driveBasicStyleFile.close();


        driveDropShadow.setBlurRadius(10);
        driveDropShadow.setColor(new QColor(0, 0, 0, 150));
        driveDropShadow.setOffset(0, 0);
        ui.aDriveWidget.setGraphicsEffect(driveDropShadow);

    }


    private void initSignalSlot()
    {
        ui.aDriveClose.clicked.connect(this, "onDriveCloseClicked");
        driveQuitAnimation.finished.connect(this, "onDriveCloseAnimationFinished");
        ui.aDriveMaximize.clicked.connect(this, "onDriveMaximizeClicked");
        ui.aDriveMinimize.clicked.connect(this, "onDriveMinimizeClicked");
        driveMinimizeAnimation.finished.connect(this, "onDriveMinimizeAnimationFinished");
        driveMinimizeToNormalAnimation.finished.connect(this, "onDriveMaximizeToNormalAnimationFinished");
        driveMaximizeAnimation.finished.connect(this, "onDriveMaximizeAnimationFinished");
        driveMaximizeToNormalAnimation.finished.connect(this, "onDriveMaximizeToNormalAnimationFinished");
    }

    @Override
    public boolean eventFilter(QObject watched, QEvent event)
    {

        if (watched == this)
        {
            if (event instanceof QMouseEvent)
            {
                QMouseEvent mouseEvent = (QMouseEvent) event;
                if (mouseEvent.type() == QEvent.Type.MouseButtonPress)
                {
                    if (mouseEvent.button().equals(Qt.MouseButton.LeftButton) && mouseEvent.pos().y() <= aDriveCommon.APP_TITLE_HEIGHT)
                    {
                        mousePressed = true;
                        mousePoint.setX(mouseEvent.globalPos().x() - pos().x());
                        mousePoint.setY(mouseEvent.globalPos().y() - pos().y());
                    }
                } else if (mouseEvent.type() == QEvent.Type.MouseButtonRelease)
                {
                    mousePressed = false;
                } else if (mouseEvent.type() == QEvent.Type.MouseMove)
                {
                    if (mousePressed)
                    {
                        move(mouseEvent.globalPos().x() - mousePoint.x(), mouseEvent.globalPos().y() - mousePoint.y());
                        return true;
                    }
                } else if (mouseEvent.type() == QEvent.Type.MouseButtonDblClick)
                {
                    onDriveMaximizeClicked();
                    return true;
                }
            }

            if (event instanceof QCloseEvent)
            {
                QCloseEvent closeEvent = (QCloseEvent) event;
                if (windowOpacity() == 0)
                {
                    closeEvent.accept();

                } else
                {
                    driveQuitAnimation.setStartValue(1);
                    driveQuitAnimation.setEndValue(0);
                    driveQuitAnimation.setDuration(aDriveCommon.APP_COMMON_ANIMATION_DURATION);
                    driveQuitAnimation.setEasingCurve(new QEasingCurve(QEasingCurve.Type.InOutExpo));
                    driveQuitAnimation.start();
                    closeEvent.ignore();
                }
                return true;
            }


            if (event instanceof QWindowStateChangeEvent)
            {

                QWindowStateChangeEvent stateChangeEvent = (QWindowStateChangeEvent) event;

                if (stateChangeEvent.oldState().testFlag(Qt.WindowState.WindowMinimized))
                {
                    driveMinimizeToNormalAnimation.setStartValue(0);
                    driveMinimizeToNormalAnimation.setEndValue(1);
                    driveMinimizeToNormalAnimation.setDuration(aDriveCommon.APP_COMMON_ANIMATION_DURATION);
                    driveMinimizeToNormalAnimation.setEasingCurve(new QEasingCurve(QEasingCurve.Type.OutBounce));
                    driveMinimizeToNormalAnimation.start();
                    return true;
                }
            }

        }

        return super.eventFilter(watched, event);
    }



    @SuppressWarnings("unused")
    @QtInvokable
    private void onDriveCloseClicked()
    {
        close();
    }


    @SuppressWarnings("unused")
    @QtInvokable
    private void onDriveMaximizeClicked()
    {
        if (isMaximized())
        {
            driveMaximizeToNormalAnimation.setStartValue(new QRect(x(), y(), width(), height()));
            driveMaximizeToNormalAnimation.setEndValue(new QRect((screenWidth - minimumSize().width()) / 2, (screenHeight - minimumSize().height()) / 2, minimumSize().width(), minimumSize().height()));
            driveMaximizeToNormalAnimation.setDuration(aDriveCommon.APP_COMMON_ANIMATION_DURATION);
            driveMaximizeToNormalAnimation.setEasingCurve(new QEasingCurve(QEasingCurve.Type.InOutQuint));
            driveMaximizeToNormalAnimation.start();
            ui.aDriveBasicVerticalLayout.setMargin(20);
        } else
        {
            driveMaximizeAnimation.setStartValue(new QRect(x(), y(), width(), height()));
            driveMaximizeAnimation.setEndValue(new QRect(0, 0, screenWidth, screenHeight));
            driveMaximizeAnimation.setDuration(aDriveCommon.APP_COMMON_ANIMATION_DURATION);
            driveMaximizeAnimation.setEasingCurve(new QEasingCurve(QEasingCurve.Type.InOutQuint));
            driveMaximizeAnimation.start();
            ui.aDriveBasicVerticalLayout.setMargin(0);
        }
    }


    @SuppressWarnings("unused")
    @QtInvokable
    private void onDriveMinimizeClicked()
    {

        driveMinimizeAnimation.setStartValue(1);
        driveMinimizeAnimation.setEndValue(0);
        driveMinimizeAnimation.setDuration(aDriveCommon.APP_COMMON_ANIMATION_DURATION);
        driveMinimizeAnimation.setEasingCurve(new QEasingCurve(QEasingCurve.Type.OutBounce));
        driveMinimizeAnimation.start();
    }



    @SuppressWarnings("unused")
    @QtInvokable
    private void onDriveCloseAnimationFinished()
    {
        close();
    }

    @SuppressWarnings("unused")
    @QtInvokable
    private void onDriveMinimizeAnimationFinished()
    {
        showMinimized();
    }

    @SuppressWarnings("unused")
    @QtInvokable
    private void onDriveMaximizeToNormalAnimationFinished()
    {
        showNormal();
    }

    @SuppressWarnings("unused")
    @QtInvokable
    private void onDriveMaximizeAnimationFinished()
    {
        showMaximized();
    }

}
