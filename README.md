# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
Changed the title from "My Bicycle Shop" to "Lui's Gaming PC Store" in line 14
Changed header from "Shop" to "PC Shop" in line 19
Changed header from "Parts" to "PC Parts" in line 21
Changed header from "Products" to "Pre-built PC's" in line 53

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
Added an AboutPageController.java file with new code from lines 1-14
Added an aboutpage.html file with new code from lines 1-16
Changed line 19 in mainscreen.html by adding a new button that leads to the aboutpage.html

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
Added an import statement in line 4 to import InhousePart from domain
Added an import statement in line 8 to import InhousePartRepository from repositories
Added an if statement that would populate data with parts and products if repository was empty in lines 64 and 117
Added parts "RTX 4080", "i7 13700K", "B650 GAMING PLUS WIFI ATX AM5", "Corsair", & "RTX 4080 Compatible Case" in lines 65-102 and saved to repository
Added products "Base Edition", "Gold Edition", "Platinum Edition", "Diamond Edition", & "Pro Edition" in lines 118-122 and saved to repository

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
Added a "Buy Now" button in line 87 of mainscreen.html that links to buyproduct
Added a BuyNowController.java file with new code from lines 1-41
Added a purchaseconfirmation.html file with new code from lines 1-13
Added a purchaseerror.html file with new code from lines 1-13

G.  Modify the parts to track maximum and minimum inventory by doing the following:
Added additional fields to the Part.java file for maximum and minimum inventory getters/setters in lines 56-62 and 97-103
Modified BootStrapData.java to include the minimum and maximum inventory in lines 71-72, 81-82, 91-92, 101-102 and 110-112
Added text inputs for minimum and maximum inventory in the InhousePartForm.html file in lines 26-33
Added text inputs for minimum and maximum inventory in the OutsourcedPartForm.html in lines 25-30
Renamed the name of the database in the application.properties file in line 6
Added an isPartInvValid method to the Part.java file in lines 131-135
Called the isPartInvValid method in the PartServiceImpl.java file in line 59
Called the isPartInvValid method in the InhousePartServiceImpl.java file in line 54
Called the isPartInvValid method in the OutsourcedPartServiceImpl.java file in line 58

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
Added a ValidMinParts.java and MinPartsValidator.java file with new code from lines 1-17 and 1-20 respectively that displays an error when adding or updating a part both below and above the minimum and maximum
Added a ValidMaxParts.java and MaxPartsValidator.java file with new code from lines 1-17 and 1-21 respectively that displays an error when adding or updating a part lowers the part inventory below the minimum

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
Added 4 unit tests for the getters/setters for the maximum and minimum fields from lines 160-194

J.  Remove the class files for any unused validators in order to clean your code.
Deleted DeletePartValidator.java and ValidDeletePart.java because there were no usages in the code