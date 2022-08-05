set projectLocation=C:\Users\a\eclipse-workspace2135\Testng_Frames
cd %projectLocation% 
set classpath=%projectLocation%\bin;%projectLocation%\lib\* 
java org.testng.TestNG %projectLocation%\testng.xml