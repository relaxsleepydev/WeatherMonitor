# WeatherMonitor

WeatherMonitor is a simple Android application built with Jetpack Compose that allows users to search for and view real-time weather information for any location.

## Features

- **Search**: Search for weather data by city or location name.
- **Real-time Data**: Displays current temperature, weather conditions (text and icons), humidity, wind speed, UV index, and precipitation.
- **Local Time**: Shows the local time and date for the searched location.
- **Responsive UI**: Built using modern Jetpack Compose components like `Scaffold`, `OutlinedTextField`, and `Card`.

## Tech Stack

- **Kotlin**: Primary programming language.
- **Jetpack Compose**: For building the native UI.
- **Retrofit**: For network requests to the Weather API.
- **Coil**: For asynchronous image loading (weather condition icons).
- **ViewModel & LiveData/StateFlow**: For managing UI state and business logic.
- **Material 3**: For modern UI components and styling.

## Getting Started

### Prerequisites

- Android Studio Ladybug or newer.
- Android SDK 24+.
- A WeatherAPI Key (sign up at [weatherapi.com](https://www.weatherapi.com/)).

### Configuration

1. Clone the repository.
2. Open the project in Android Studio.
3. Locate `Constant.kt` (if applicable) and add your API key.4. Build and run the app on an emulator or physical device.

## Project Structure

- `api/`: Contains Retrofit interface, data models, and network response wrappers.
- `WeatherViewModel.kt`: Handles API calls and manages the UI state.
- `WeatherPage.kt`: The main Composable UI for the weather dashboard.
- `MainActivity.kt`: Entry point of the application.

## Credits

Special thanks to **Easy Tuto** for their excellent tutorial. This project was developed following their guidance on building a Weather App with Jetpack Compose. 
*Link to the tutorial video: https://youtu.be/Kn6vUH1uJT4?si=g0cS2j5KBRb7WBZr*
