# Level 3: Sports News Management System

This package implements a complete domain model and interactive console system for managing sports news redactors and articles.

## Class Overview

### 1. `Noticia.java` (Abstract Base Class)
- **Role**: Abstract parent class representing a news article.
- **Attributes**: `titular`, `text`, `puntuacio`, `preu`.
- **Abstract Methods**:
  - `public abstract double calcularPreuNoticia()`
  - `public abstract int calcularPuntuacio()`

### 2. Specialized News Subclasses
- `NoticiaFutbol`: Implements specific scoring and pricing based on competition, club (e.g., Barça, Madrid), and player (e.g., Ferran Torres, Benzema).
- `NoticiaBasquet`: Calculates price and score based on EuroLeague / ACB and clubs.
- `NoticiaTenis`: Applies business logic for Grand Slam competitions and players (Federer, Nadal, Djokovic).
- `NoticiaF1`: Calculates costs and points based on escuderia (Ferrari, Mercedes).
- `NoticiaMotociclisme`: Applies pricing rules for motorcycle teams (Honda, Yamaha).

### 3. `Redactor.java`
- **Role**: Represents a journalist managing a list of articles.
- **Key Concepts**: Immutable `final String dni`, static shared salary `sou`, encapsulated `List<Noticia>`.

### 4. `Main.java`
- **Role**: Console controller with a complete interactive CRUD menu for redactors and news.
