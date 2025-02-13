package designpatterns.factory.after;


import designpatterns.factory.after.base.Theme;
import designpatterns.factory.after.base.ThemeComponentFactory;
import designpatterns.factory.after.base.ThemeFactory;
import designpatterns.factory.after.ios.IOSUITheme;
import designpatterns.factory.after.material.MaterialUITheme;

public class Client {
    private static final String THEME = "ios";
    //private static final String THEME = "material"; this creates for material rest all same
    

    public static void main(String[] args) {
        Theme theme = ThemeFactory.createThemeForIdentifier(THEME); // practical factory
       
        // wo above practical factory
        // Theme theme;
        // if(theme=="material")
        //  theme=new MaterialUITheme();
        // else
        //  theme=new IOSUITheme();
        
        ThemeComponentFactory themeComponentFactory = theme
                .createThemeComponentFactory(); // this is method factort

        themeComponentFactory.createButton(); 
        themeComponentFactory.createMenu();
        themeComponentFactory.createDropDown();


    }
}

// ShoeFacotry
// all methods will return shoe
// => Practical Factory


// Footwear Factory
// all methods will return shoe/ sandals/ chappal/
// => abstract factory
