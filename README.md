# JavaFX Helper Project

## Overview

This project demonstrates how to use JavaFX to build a simple application showcasing event handling and FXML integration. It provides an example of initializing a JavaFX application, defining a controller, and programmatically triggering button actions. This project is intended as a learning resource for JavaFX beginners and as a reference for best practices.

## Features

- JavaFX Application structure with `FXML`.
- Programmatically triggering button actions using `Button.fire()` and `ActionEvent`.
- Easy-to-understand example of event handling in JavaFX.

## Project Structure

- **App.java**: Entry point for the JavaFX application. Loads the FXML layout and sets the scene.
- **MainController.java**: The controller for the FXML file. Demonstrates button event handling and label updates.
- **main.fxml**: Defines the user interface, including a button and a label.
- **build.gradle**: Configuration file for building and running the project using Gradle.

## Usage

### Prerequisites

- Java Development Kit (JDK) 8 or later.
- Gradle (if not bundled with your IDE).

### How to Run

1. Clone this repository.

2. Navigate to the project directory.

3. Execute the following command to run the application:

   ```
   gradlew run
   ```

### Expected Behavior

- When the application starts, the button is programmatically "clicked" during initialization using `button.fire()`. This triggers the button's `onAction` handler and updates the label text with the button's label.

## Code Highlights

### 1. Button Event Triggering

#### Preferred Method: Using `Button.fire()`

```
@Override
public void initialize(URL location, ResourceBundle resources) {
    // Programmatically simulate a button click
    button.fire();
}
```

#### Alternative Method: Creating an `ActionEvent`

```
@Override
public void initialize(URL location, ResourceBundle resources) {
    // Manually create an ActionEvent and pass it to the handler
    ActionEvent event = new ActionEvent(button, null);
    buttonOnAction(event);
}
```

### 2. Event Handling

```
@FXML
void buttonOnAction(ActionEvent event) {
    if (event == null || event.getSource() == null) {
        System.out.println("ActionEvent or its source is null!");
        return;
    }

    String getButtonText = ((Button) event.getSource()).getText();
    lblListening.setText(getButtonText);
}
```

## Related Resources

- [StackOverflow Question](https://stackoverflow.com/questions/53901703/image-chooser-javafx-android-mobile/79348358#79348358)
- Documentation: [JavaFX User Guide](https://openjfx.io/)