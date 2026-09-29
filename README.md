# Krankenhausverwaltung

Eine Java-basierte Krankenhausverwaltungs-Anwendung für die Verwaltung von Ärzten, Stationen und Befunden im Konsolenmenü.

## Überblick

Das Projekt modelliert eine einfache Krankenhausverwaltung mit:

- Verwaltung von Ärzten
- Zuordnung von Ärzten zu Stationen
- Anzeige des Personals pro Station
- Erstellung und Bearbeitung von Befunden
- Interaktive Eingabe über die Konsole

Die Hauptlogik befindet sich in `src/main/java/at/uastw/prog1` und wird über die Klasse `Main` gestartet.

## Projektstruktur

```text
Krankenhausverwaltung/
├── src/
│   └── main/
│       └── java/
│           └── at/
│               └── uastw/
│                   └── prog1/
│                       ├── Arzt.java
│                       ├── Befund.java
│                       ├── Frontend.java
│                       ├── Main.java
│                       ├── Person.java
│                       └── Station.java
├── pom.xml
├── .gitignore
├── UML Diagramm.png
├── WICHTIG.txt
└── README.md
```

## Kernfunktionen

- Arzt anlegen
- Ärzte im Krankenhaus anzeigen
- Arzt einer Station zuweisen
- Personal einer Station anzeigen
- Befund anlegen, lesen und bearbeiten
- Beenden der Anwendung

## Technologien

- Java 15
- Maven
- Konsolen-UI (`Scanner` / Terminal-Eingabe)

## Voraussetzungen

- Java JDK 15 oder höher
- Maven

## Ausführen

1. Repository clonen:

```bash
git clone https://github.com/ayah05/Krankenhausverwaltung.git
cd Krankenhausverwaltung
```

2. Projekt kompilieren:

```bash
mvn compile
```

3. Anwendung starten:

```bash
java -cp target/classes at.uastw.prog1.Main
```

## Hinweis

Das Programm ist ein Lehrprojekt / Konsolenprogramm und dient zur Darstellung eines einfachen Krankenhausverwaltungssystems im Unterrichts- oder Übungsbereich.

## Lizenz

Dieses Projekt nutzt aktuell keine explizite Lizenzdatei. Bitte prüfe vor der Veröffentlichung oder weiterem Einsatz die Lizenzbedingungen im Repository.
