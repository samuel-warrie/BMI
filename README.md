# BMI Calculator App

## Overview
The BMI Calculator App is a simple and user-friendly Android application built with Kotlin. It allows users to calculate their Body Mass Index (BMI) based on their weight and height. The app provides instant feedback on whether the user is underweight, normal weight, overweight, or obese according to the BMI classification.

## Features
- Input fields for weight (in kilograms) and height (in meters or centimeters).
- Instant BMI calculation upon user input.
- Clear classification of BMI results: underweight, normal weight, overweight, or obese.
- Responsive and intuitive user interface.

## Installation
1. Clone this repository or download the project as a ZIP file.
   ```bash
   git clone <repository_url>
   ```
2. Open the project in Android Studio.
3. Sync the Gradle files.
4. Build and run the app on an emulator or a physical Android device.

## Usage
1. Launch the app on an Android device.
2. Enter your weight in kilograms in the provided input field.
3. Enter your height in meters or centimeters.
4. Tap the "Calculate BMI" button to view the result.
5. The app will display your BMI value along with its corresponding category (e.g., Normal weight).

## Code Structure
- **MainActivity.kt**: Handles user input, BMI calculation logic, and UI interactions.
- **XML Layouts**: Defines the user interface of the app.
  - **activity_main.xml**: Contains input fields, buttons, and result display components.

## BMI Calculation Formula
The BMI is calculated using the formula:
```
BMI = weight (kg) / (height (m) * height (m))
```

## BMI Categories
| BMI Range       | Category         |
|-----------------|------------------|
| < 18.5          | Underweight      |
| 18.5 - 24.9     | Normal weight    |
| 25.0 - 29.9     | Overweight       |
| ≥ 30.0        | Obesity          |

## Dependencies
- **Kotlin**: The primary programming language used for the app.
- **AndroidX**: For backward compatibility and modern Android components.

## Contributing
Contributions are welcome! Feel free to open issues or submit pull requests for bug fixes, enhancements, or new features.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.

## Contact
For questions or suggestions, please contact:
- **Name**: Samuel Warrie
- **Email**: [samuelwarrie735@gmail.com](mailto:samuelwarrie735@gmail.com)

