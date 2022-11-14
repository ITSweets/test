package vip.itsweets;

import io.qt.core.*;
import io.qt.widgets.QApplication;
import io.qt.widgets.QWidget;
import vip.itsweets.constant.aDriveCommon;
import vip.itsweets.ui.aDriveBasic;


public class Launcher
{
    public static void main(String[] args)
    {
        QApplication.initialize(args);
        QResource.registerResource(String.valueOf(Launcher.class.getClassLoader().getResource("aDrive.rcc")).substring(6));

        QWidget aDriveBasic = new aDriveBasic();

        QPropertyAnimation aDriveStartAnimation = new QPropertyAnimation(aDriveBasic, "windowOpacity", aDriveBasic);
        aDriveStartAnimation.setDuration(aDriveCommon.APP_COMMON_ANIMATION_DURATION);
        aDriveStartAnimation.setStartValue(0);
        aDriveStartAnimation.setEndValue(1);
        aDriveStartAnimation.setEasingCurve(new QEasingCurve(QEasingCurve.Type.InOutExpo));
        aDriveStartAnimation.start();

        aDriveBasic.show();

        QApplication.exec();
        QApplication.shutdown();
    }
}
