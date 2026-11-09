# Level 2: Smartphone Interfaces & Multiple Inheritance

This package demonstrates **Multiple Interface Implementation** combined with **Class Inheritance** in Java.

## Class Overview

### 1. `Phone.java` (Superclass)
- **Attributes**: `marca`, `model`.
- **Methods**: `public void call(int number)` — Handles basic telephony functionality.

### 2. `Camera.java` (Interface)
- **Method Contract**: `void takePicture()`.

### 3. `Clock.java` (Interface)
- **Method Contract**: `void alarmSounds()`.

### 4. `Smartphone.java` (Subclass & Interface Implementation)
- **Inheritance & Interfaces**: `extends Phone implements Clock, Camera`
- **Override**: Implements `takePicture()` from `Camera` and `alarmSounds()` from `Clock`.
