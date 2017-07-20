#coding-utf-8
import os
import os.path

# del report
os.system("adb shell rm -rf /sdcard/report.xml")
filename = 'report.xml'
if os.path.exists("report.xml"):
	os.remove("report.xml")

# uninstall app and testapp
os.system("adb uninstall com.example.add")
os.system("adb uninstall com.example.add.test")

#build test app
os.system("ant clean debug")

#install app and test app
os.system("adb install ../Calculate16/bin/Calculate16-debug.apk")
os.system("adb install ./bin/Calculate16Test-debug.apk")

#test report 
os.system("adb shell am instrument -w -e reportDir sdcard -e reportFile calreport.xml com.example.add.test/com.zutubi.android.junitreport.JUnitReportTestRunner")

# pull test report
os.system("adb pull /sdcard/calreport.xml ./")
 






