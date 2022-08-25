
<img src="images/BlackMinimalBanner.png" class="img-responsive" alt=""> </div>

The (Criminal) Face Detection System PELIGRO is designed to identify criminal faces by comparing them to previously recorded information in the database.

# Log In
Log in the application. If you do not have an account, sign up.                                                                                                           
Package: userEnterApp(run LogInForm first)
# Capture person
Here you can register new person, filling in some important details. Then programme prompts you to take photos of this person. After all steps, new person is successfuly can be seen in database.                                                                                                                                                 
Package: Capture
# Recognize
Identify the person with the help of video capturing. If the person is not identified, nothing is displayed. If recognized, id and name will be visible. Identifies only one person at time.                                                                                                                                                       
Package: Recognize
# Who's in database?
You can see information about people in database. If you click on "Data", a table with appropriate data will be displayed.                                               
Package: dbOfCriminals
                                                                                                                                                       
# Other packages
Package connectToDB is responsible for connection to database (phpMyAdmin is used to test MySQL). Also, it makes a model of crimnal based on previously given information.                                                                                                                                                             
Package cardButtons is for attractive buttons built with the help of graphics.

# Technologies used
* Core Java
* MySQL, JDBC
* OpenCV, JavaCV
* Java Swing
* Threads, graphics

# Note!
To run project successfully you need to add jar name in CLASSPATH. Required .jar files: mysql-connector-java, opencv and javacv (with all required dependencies), org-netbeans-modules-swingapp.                                                                                                                                             Also, you need to download classifierLBHP to detect face for capturing and haarcascade_frontalface_alt to train model.

