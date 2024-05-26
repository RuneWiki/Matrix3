@echo off
"C:\Program Files (x86)\Java\jre1.8.0_31\bin\java.exe" -Xms128m -Xmx800m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=10000 -cp bin; game.RS3Applet
pause