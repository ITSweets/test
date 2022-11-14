package vip.itsweets.ui;

import io.qt.core.*;
import io.qt.widgets.*;

public class UI_aDriveBasic {

    public QVBoxLayout aDriveBasicVerticalLayout;
    public QWidget aDriveWidget;
    public QVBoxLayout verticalLayout;
    public QWidget widget;
    public QHBoxLayout horizontalLayout_3;
    public QWidget widget_4;
    public QHBoxLayout horizontalLayout_4;
    public QPushButton aDriveLogo;
    public QLabel aDriveName;
    public QSpacerItem horizontalSpacer;
    public QWidget widget_3;
    public QHBoxLayout horizontalLayout_2;
    public QPushButton aDriveTheme;
    public QPushButton aDriveMenu;
    public QFrame line;
    public QWidget widget_2;
    public QHBoxLayout horizontalLayout;
    public QPushButton aDriveMinimize;
    public QPushButton aDriveMaximize;
    public QPushButton aDriveClose;
    public QSpacerItem verticalSpacer;
    public QHBoxLayout horizontalLayout_5;
    public QPushButton pushButton;

    public void setupUi(QWidget aDriveBasic){

        if (aDriveBasic.objectName().isEmpty())
            aDriveBasic.setObjectName("aDriveBasic");
        aDriveBasic.resize(1180, 740);
        aDriveBasic.setMinimumSize(new QSize(1180, 740));
        aDriveBasic.setStyleSheet("");
        this.aDriveBasicVerticalLayout = new QVBoxLayout(aDriveBasic);
        this.aDriveBasicVerticalLayout.setSpacing(0);
        this.aDriveBasicVerticalLayout.setObjectName("aDriveBasicVerticalLayout");
        this.aDriveBasicVerticalLayout.setContentsMargins(20, 20, 20, 20);
        this.aDriveWidget = new QWidget(aDriveBasic);
        this.aDriveWidget.setObjectName("aDriveWidget");
        this.aDriveWidget.setMinimumSize(new QSize(1140, 700));
        this.verticalLayout = new QVBoxLayout(this.aDriveWidget);
        this.verticalLayout.setSpacing(0);
        this.verticalLayout.setObjectName("verticalLayout");
        this.verticalLayout.setContentsMargins(0, 0, 0, 0);
        this.widget = new QWidget(this.aDriveWidget);
        this.widget.setObjectName("widget");
        this.horizontalLayout_3 = new QHBoxLayout(this.widget);
        this.horizontalLayout_3.setSpacing(0);
        this.horizontalLayout_3.setObjectName("horizontalLayout_3");
        this.horizontalLayout_3.setContentsMargins(10, 10, 10, 10);
        this.widget_4 = new QWidget(this.widget);
        this.widget_4.setObjectName("widget_4");
        this.horizontalLayout_4 = new QHBoxLayout(this.widget_4);
        this.horizontalLayout_4.setSpacing(10);
        this.horizontalLayout_4.setObjectName("horizontalLayout_4");
        this.horizontalLayout_4.setContentsMargins(0, 0, 0, 0);
        this.aDriveLogo = new QPushButton(this.widget_4);
        this.aDriveLogo.setObjectName("aDriveLogo");
        QSizePolicy sizePolicy = new QSizePolicy(QSizePolicy.Policy.Fixed, QSizePolicy.Policy.Fixed);
        sizePolicy.setHorizontalStretch(0);
        sizePolicy.setVerticalStretch(0);
        sizePolicy.setHeightForWidth(this.aDriveLogo.sizePolicy().hasHeightForWidth());
        this.aDriveLogo.setSizePolicy(sizePolicy);
        this.aDriveLogo.setMinimumSize(new QSize(36, 36));
        this.aDriveLogo.setMaximumSize(new QSize(36, 36));

        this.horizontalLayout_4.addWidget(this.aDriveLogo);
        this.aDriveName = new QLabel(this.widget_4);
        this.aDriveName.setObjectName("aDriveName");

        this.horizontalLayout_4.addWidget(this.aDriveName);

        this.horizontalLayout_3.addWidget(this.widget_4);
        this.horizontalSpacer = new QSpacerItem(40, 20, QSizePolicy.Policy.Expanding, QSizePolicy.Policy.Minimum);

        this.horizontalLayout_3.addItem(this.horizontalSpacer);
        this.widget_3 = new QWidget(this.widget);
        this.widget_3.setObjectName("widget_3");
        this.horizontalLayout_2 = new QHBoxLayout(this.widget_3);
        this.horizontalLayout_2.setObjectName("horizontalLayout_2");
        this.horizontalLayout_2.setContentsMargins(0, 0, 0, 0);
        this.aDriveTheme = new QPushButton(this.widget_3);
        this.aDriveTheme.setObjectName("aDriveTheme");
        sizePolicy.setHeightForWidth(this.aDriveTheme.sizePolicy().hasHeightForWidth());
        this.aDriveTheme.setSizePolicy(sizePolicy);
        this.aDriveTheme.setMinimumSize(new QSize(40, 30));
        this.aDriveTheme.setMaximumSize(new QSize(40, 30));

        this.horizontalLayout_2.addWidget(this.aDriveTheme);
        this.aDriveMenu = new QPushButton(this.widget_3);
        this.aDriveMenu.setObjectName("aDriveMenu");
        sizePolicy.setHeightForWidth(this.aDriveMenu.sizePolicy().hasHeightForWidth());
        this.aDriveMenu.setSizePolicy(sizePolicy);
        this.aDriveMenu.setMinimumSize(new QSize(40, 30));
        this.aDriveMenu.setMaximumSize(new QSize(40, 30));

        this.horizontalLayout_2.addWidget(this.aDriveMenu);

        this.horizontalLayout_3.addWidget(this.widget_3);
        this.line = new QFrame(this.widget);
        this.line.setObjectName("line");
        this.line.setMaximumSize(new QSize(16777215, 30));
        this.line.setFrameShape(QFrame.Shape.HLine);
        this.line.setFrameShadow(QFrame.Shadow.Sunken);

        this.horizontalLayout_3.addWidget(this.line);
        this.widget_2 = new QWidget(this.widget);
        this.widget_2.setObjectName("widget_2");
        this.horizontalLayout = new QHBoxLayout(this.widget_2);
        this.horizontalLayout.setSpacing(0);
        this.horizontalLayout.setObjectName("horizontalLayout");
        this.horizontalLayout.setContentsMargins(0, 0, 0, 0);
        this.aDriveMinimize = new QPushButton(this.widget_2);
        this.aDriveMinimize.setObjectName("aDriveMinimize");
        sizePolicy.setHeightForWidth(this.aDriveMinimize.sizePolicy().hasHeightForWidth());
        this.aDriveMinimize.setSizePolicy(sizePolicy);
        this.aDriveMinimize.setMinimumSize(new QSize(40, 30));
        this.aDriveMinimize.setMaximumSize(new QSize(40, 30));

        this.horizontalLayout.addWidget(this.aDriveMinimize);
        this.aDriveMaximize = new QPushButton(this.widget_2);
        this.aDriveMaximize.setObjectName("aDriveMaximize");
        sizePolicy.setHeightForWidth(this.aDriveMaximize.sizePolicy().hasHeightForWidth());
        this.aDriveMaximize.setSizePolicy(sizePolicy);
        this.aDriveMaximize.setMinimumSize(new QSize(40, 30));
        this.aDriveMaximize.setMaximumSize(new QSize(40, 30));

        this.horizontalLayout.addWidget(this.aDriveMaximize);
        this.aDriveClose = new QPushButton(this.widget_2);
        this.aDriveClose.setObjectName("aDriveClose");
        sizePolicy.setHeightForWidth(this.aDriveClose.sizePolicy().hasHeightForWidth());
        this.aDriveClose.setSizePolicy(sizePolicy);
        this.aDriveClose.setMinimumSize(new QSize(40, 30));
        this.aDriveClose.setMaximumSize(new QSize(40, 30));
        this.aDriveClose.setStyleSheet("");

        this.horizontalLayout.addWidget(this.aDriveClose);

        this.horizontalLayout_3.addWidget(this.widget_2);

        this.verticalLayout.addWidget(this.widget);
        this.verticalSpacer = new QSpacerItem(20, 40, QSizePolicy.Policy.Minimum, QSizePolicy.Policy.Expanding);

        this.verticalLayout.addItem(this.verticalSpacer);
        this.horizontalLayout_5 = new QHBoxLayout();
        this.horizontalLayout_5.setObjectName("horizontalLayout_5");
        this.pushButton = new QPushButton(this.aDriveWidget);
        this.pushButton.setObjectName("pushButton");

        this.horizontalLayout_5.addWidget(this.pushButton);

        this.verticalLayout.addLayout(this.horizontalLayout_5);

        this.aDriveBasicVerticalLayout.addWidget(this.aDriveWidget);

        this.retranslateUi(aDriveBasic);

        QMetaObject.connectSlotsByName(aDriveBasic);
    }

    public void retranslateUi(QWidget aDriveBasic)
    {
        aDriveBasic.setWindowTitle(io.qt.core.QCoreApplication.translate("aDriveBasic", "Form", null));
        this.aDriveLogo.setText("");
        this.aDriveName.setText(io.qt.core.QCoreApplication.translate("aDriveBasic", "aDrive Utlimate", null));
        this.aDriveTheme.setText("");
        this.aDriveMenu.setText("");
        this.aDriveMinimize.setText("");
        this.aDriveMaximize.setText("");
        this.aDriveClose.setText("");
        this.pushButton.setText(io.qt.core.QCoreApplication.translate("aDriveBasic", "PushButton", null));
    }
}

