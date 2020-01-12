# Spinner and TextView project

## Description -

This project shows some examples of how to edit the TEXTVIEW, SPINNER and SCROLLVIEW. Through interaction of the spinner, we are changing the textview properties. 

## Current version:
  - Android Studio Version 3.5.2
  - Android SDK tool Version 26.1.1
  - Virtual device used = "Nexus 5X API 29 x86"
  
## What is a Spinner? 
In Android, Spinner provides a quick way to select one value from a set of values. Android spinners are nothing but the drop down-list seen in other programming languages. In a default state, a spinner shows its currently selected value. It provides a easy way to select a value from a list of values.

## What is a TextView? 
In Android, TextView displays text to the user and optionally allows them to edit it programmatically. TextView is a complete text editor, however basic class is configured to not allow editing but we can edit it.

## What is a ScrollView? 
The ScrollView is a generic scrolling container that can host multiple components and views. The scrollable items need not be homogeneous, and you can scroll both vertically and horizontally (by setting the horizontal property).

## Screenshots:
<img src="https://github.com/RattyMyles/spinnertest/blob/master/images/SpinnerSize.png" width="300" height="480"><img src="https://github.com/RattyMyles/spinnertest/blob/master/images/spinnerColor.png" width="300" height="480">
<img src="https://github.com/RattyMyles/spinnertest/blob/master/images/spinnerDefault.png" width="300" height="480"><img src="https://github.com/RattyMyles/spinnertest/blob/master/images/spinnerCaps.png" width="300" height="480">

## MainActivity.java

Within this file, this is how i created the Spinner and adding the elements of the drop down menu.
```java
        /*
            create the spinner(drop down list) and create an array with four elements.
         */
        Spinner sp = (Spinner) findViewById(R.id.test_spinner);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new
                String[]{"default","size", "color", "caps",});
        sp.setAdapter(aa);
```
It is worth mentioning the code below, this is how I pulled the spinner and managed to select an item in the array by Strings.
```java
public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // due to the drop down being Strings, below will get selected item and checks if it equals to string
                Spinner spinner = (Spinner)findViewById(R.id.test_spinner);
                String text = spinner.getSelectedItem().toString();
                TextView test = findViewById(R.id.textView);
                if(text == "default"){\\ do stuff here }
```

## Main_activity.xml
If you are interested in the style of the app, you can always take a look at the XML file.
