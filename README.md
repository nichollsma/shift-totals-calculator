# shift-totals-calculator

-----------------------------------------------------------------------------

## Table of Contents

--------------------

1. [Overview](#overview)
2. [Installation Instructions](#installation-instructions)
3. [Usage Instructions](#usage-instructions)
4. [FAQs](#faqs)
5. [Troubleshooting](#troubleshooting)
6. [Support and Contact](#support-and-contact)
7. [How to Contribute?](#how-to-contribute)
8. [License](#license)

## Overview

-----------

This is a simple student-developed program developed to help create an overview for the data of a restaurant server's shift.  
This program will also assist in calculating an optional bar tipout, as well as the net tips earned after the tipout.  
Users will select an option in the menu, which will be to either input data, calculate a bar tipout or net tips earned, and display an overview of shift data.  
The menu is very easy to navigate and use, and only requires simple inputs from the user to operate.  

Here are some images of the menu in action:  
 
**Main screen:**  
![Main screen of the menu](images/menu.PNG)
 
**Input Example:**  
![Inputting total sales](images/inputEx.PNG)
 
**Net Tip Calculation Example:**  
![Example of calculating net tips](images/netTipsEx.PNG)
 
**Overview Screen Example:**  
![Example of overview screen](images/overviewEx.PNG)
 
## Installation Instructions

-----------------------------

A **Java Runtime Environment** installation is required, which can be found [here](https://www.java.com/en/download) or [here](https://www.oracle.com/java/technologies/javase-downloads.html). These links will contain any of the information you need to download Java for your operating system.

To extract the files you will need a **file archiver** such as [WinRAR](https://www.rarlab.com/download.htm) or [Zip](https://www.7-zip.org/download.html).  
*Newer versions of Windows and MacOS also allow ZIP file extraction through their respective file explorers.*

 **1. Download the Program**  
  The application can be downloaded as a ZIP file using [this link.](https://github.com/nichollsma/shift-totals-calculator/archive/master.zip)  
  *The downloaded file includes everything you need to run the application.*
 
 **2. Extract Files**  
  Open the ZIP file using one of the programs or methods mentioned above, then extract the files to a destination folder of your choice.
  
 **3. Run the Application**  
  To use the application, simply double click the jar file located within the files you extracted during the previous step and the menu will display.
  
*Voila!* You have now installed the shift totals calculator program and are ready to use it at any time.
 
## Usage Instructions

---------------------

**1. Run the program**  
 To use the application, simply double click the jar file located within the files you extracted during step 2 of the [installation process](#installation-instructions) and the menu will display.  The menu looks like this:
 ![Main screen of the menu](images/menu.PNG)
 
**2. Selection a menu option**  
 To use one of the options of the menu, simply type the number in the list that corresponds to the action you want to perform then click the "OK" button.  
 If you selected the wrong option, you can simply click the "Cancel" button to take you back to the main menu.
 For example, to set the value for your total sales, you would type the number 7 into the box like in the image below, and then click the "OK" button.
 ![Setting total sales](images/setSales.PNG)

**3. Input your data**  
 Menu options 6 through 10 are used to input data, with each option stating what data you will input upon selecting it. You must input data for everything but your bar tip out if you want this program to work as intended, however the order in which you input your data is not important.  
 
 Menu options 6 - 10:  
 ![Menu options to input data](images/inputSel.PNG)  
 Option 10 is optional, as the shift overview will calculate a bar tip out corresponding to 20% of your alcohol sales, however you can use option 10 to enter in a custom tip out if you do not use a 20% calculation.  
 
 As an example, here is what will be displayed when you select menu option 7 - "Set total sales":  
 ![Inputting total sales](images/inputEx.PNG)
 
**4. Display your data**  
 Menu options 1 though 5 as well as option 11 are used to display your data, with each option stating what data will be displayed upon being selected.  
 
 Menu options 1 - 5:
 ![Menu options 1 through 5 to display data](images/display15.PNG)
 
 Menu options 11:
 ![Menu option 11 to display net tips](images/display11.PNG)  
 Option 11 will calculate your net tips for the shift and display the calculation, which is your total tips minus your bar tip out.  
 
 As an example, here is what will be displayed when you select option 3 - "Display total tips":  
 1[Displaying total tips](images/displayEx.PNG)
 
**5. Display the overview**  
 Menu option 12 is used to display the overview of your data, which includes your section, total sales, total tips, alcohol sales, and bar tip out. This is the main use of the program, and will hopefully save you from looking through your checkout slip multiple times.
 
 Here is an example of what is displayed when you select menu option 12 - "Display all field variables for the item":  
 ![Example of overview screen](images/overviewEx.PNG)![Example of using the overview menu option](images/ovi)

**6. Exit the program**  
 When you are done using the program, you may exit by clicking the "X" in the top right of the menu, highlighted yellow in the following picture:  
 ![Exiting using the "X"](images/exit1.PNG)
 
 Or by selecting menu option 13 - "Exit":  
 ![Exiting using option 13](images/exit2.PNG)
 
 Your data **will not** be saved, so be careful not to exit before you are done using the program!
 
## FAQs

-------

Q: Why was this program developed?

A: The developer worked as a server for about 5 years, and wanted to create an easy and at-a-glance view for himself and other servers without having to constantly refer to unformatted and confusing checkout slips

Q: Are there any new features planned?

A: Of course! There are some exciting ones in developement, but if you have your own idea you may submit it at the [issues page](https://github.com/nichollsma/shift-totals-calculator/issues) using [this guide](https://docs.github.com/en/github/managing-your-work-on-github/creating-an-issue).

Q: Are there conversions for local currency rather than USD?

A: This feature has not been implemented yet, but it is currently in development with plans to include it in the next update.

Q: Can I use this program on my phone?

A: This program has not been implemented for use on mobile devices, and there are currently no plans to create an implementation for mobile devices.
 
## Troubleshooting

------------------

 * If you have any problems downloading the file or the programs mentioned in the [installation instructions](#installation-instructions) section, try refreshing the page or reconnecting to the internet before reattempting to download
 * If the download links for Java as well as WinRAR and 7Zip are broken or lead to an error page, the products can easily be found on a search engine.
 * If you have problems opening the ZIP file with your OS's file explorer, try using one of the programs mentioned in the [installation instructions](#installation-instructions) section
 * If you have problems using either WinRAR or 7Zip, try reinstalling or updating your program, and if the problem persists try using the other program mentioned
 * If the jar file does not run, try renstalling or updating your Java installation as well as restarting your computer before trying to run the file again
 
The Troubleshooting and Support pages for Java, WinRAR, and 7Zip can be found through the download links listed in the [installation instructions](#installation-instructions) section, or can be found through a search engine. I **strongly** suggest visiting those pages for more information as they will offer more detail and cover specific issues of their respective programs not able to be listed here.
 
If you are unable to resolve your issue or are experiencing an issue not mentioned above, you are welcome to email **nichollsma@appstate.edu** with any problems or concerns.

## How to Contribute?

---------------------

If you are **unfamiliar with coding**:  
You may submit bug reports, issues, and new feature suggestions on the [issues page](https://github.com/nichollsma/shift-totals-calculator/issues) using [this guide](https://docs.github.com/en/github/managing-your-work-on-github/creating-an-issue).
  
If you have **developed programs before**:  
You are welcome to propose additions or alterations to the source code by forking the [repository](https://github.com/nichollsma/shift-totals-calculator), altering the source code as you see fit, and creating a pull request.  
You may also collaborate directly with the developer by contacting **nichollsma@appstate.edu** or viewing the [GitHub page](https://github.com/nichollsma/shift-totals-calculator).  
Any pull requests and issues, including new features, bug reports, etc. are encouraged and gladly accepted!  

## Support and Contact

----------------------

If you are having any trouble installing or using the program, please refer to the [troubleshooting](#troubleshooting) section first. 

Otherwise, any comments, concerns, or unanswered questions about the program are very welcome and may be sent by email to **nichollsma@appstate.edu**.  You may also submit an issue or bug on the program's [issues page](https://github.com/nichollsma/shift-totals-calculator/issues) while adhering to the [GitHub issue creation guide](https://docs.github.com/en/github/managing-your-work-on-github/creating-an-issue).

## License

----------
 
[MIT License](https://github.com/nichollsma/shift-totals-calculator/blob/master/LICENSE)

Copyright (c) 2020 Mathew Nicholls

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
