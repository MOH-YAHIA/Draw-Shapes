# Draw-Shapes  

## Overview  
Draw-Shapes is a **Java GUI application** that allows users to **calculate the area and perimeter** of different shapes (**Rectangle, Square, Circle**) and draw them with their preferred color.  

## Features  
- Select a shape (Rectangle, Square, Circle)  
- Enter dimensions (width, height, or radius)  
- Choose a preferred color  
- Calculate and display **area & perimeter**  
- Draw the shape with the selected color

## How to Run  
### 1.Install Java (if not already installed)  
  - Ensure **Java** is installed on your system by running the following command in the **terminal** (Mac/Linux) or **command prompt** (Windows): java --version
  - If Java is not installed, download and install it from: [Java Downloads](https://www.oracle.com/java/technologies/downloads/?er=221886)
  
### 2. Download the `DrawShape.jar` file from this repository.  
### 3. Double-click the JAR file or run: java -jar DrawShape.jar

## Project Structure  
- **DrawShape.java** → Main class that starts the application
- **ChooseShape.java** → Manages user input and shape selection  
- **Shape.java** → Base class for all shapes  
- **Rectangle.java, Square.java, Circle.java** → Implement shape-specific logic  
- **Draw.java** → Handles drawing shapes on the GUI
- **DrawShape.jar** → Executable file to run the project without compiling the source code.

