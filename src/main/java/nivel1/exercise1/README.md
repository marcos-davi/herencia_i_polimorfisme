# Level 1 - Exercise 1: Musical Instruments Hierarchy

This package demonstrates **Abstraction**, **Inheritance**, and **Polymorphism** in Java using a musical instrument hierarchy.

## Class Overview

### 1. `Instrument.java` (Abstract Base Class)
- **Role**: Serves as the superclass for all instrument types.
- **Attributes**: 
  - `private String name`: Name of the instrument.
  - `private int price`: Price of the instrument.
- **Abstract Method**:
  - `public abstract void play()`: Declares the contract that every subclass must implement to define its specific playing sound.

### 2. `WindInstrument.java`
- **Role**: Concrete subclass representing wind instruments.
- **Inheritance**: `extends Instrument`
- **Override**: Implements `play()` to output: `"Està sonant un instrument de vent"`.

### 3. `StringInstrument.java`
- **Role**: Concrete subclass representing string instruments.
- **Inheritance**: `extends Instrument`
- **Override**: Implements `play()` to output: `"Està sonant un instrument de corda"`.

### 4. `PercussionInstrument.java`
- **Role**: Concrete subclass representing percussion instruments.
- **Inheritance**: `extends Instrument`
- **Override**: Implements `play()` to output: `"Està sonant un instrument de percussió"`.

### 5. `Main.java`
- **Role**: Execution entry point.
- **Functionality**: Instantiates `PercussionInstrument`, `StringInstrument`, and `WindInstrument` objects and calls their `play()` methods.
