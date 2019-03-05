package by.belstu.it.kalach;

import pack.WrapperString;

@SuppressWarnings("unused")
public class Main{
    public static void main(String[] args) {
        // TODO commit
        System.out.println("Сgf");
         TestFunction obj = new TestFunction();
         for(int i=0;i<9;i++)
         {
             if(i>-1)
                 if(i<10)
                     System.out.print(i);
         }
         obj.onCreate();
        WrapperString wrapperString = new WrapperString("fe");
        wrapperString.replace("alt","next");
    }
}
