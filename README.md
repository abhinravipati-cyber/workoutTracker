# TrackLifts

A Java application for creating customizable workout splits and logging completed workouts.

I started this project as a way to apply what I was self-learning about object-oriented programming to something I actually use and care about: weightlifting. As I continue developing it, my long-term goal is to turn it into a full-stack workout tracking application while learning the technologies required to do so.

## Current Features

- Create customizable workout splits
- Create multiple workout days within a split
- Add exercises and set quantities to workout days
- Log completed workouts
- Record completed exercises, sets, weights, and reps
- View in-memory workout plans and previously logged workouts

Currently, workout data is stored in memory.

## Project Structure

The application is organized using several Java classes:

- `User` — represents the user and their workout information
- `Split` — represents a customizable workout split
- `WorkoutDay` — contains the exercises planned for a particular workout day
- `Exercise` — represents an exercise and its planned sets
- `CompletedDay` — represents a completed workout
- `CompletedExercise` — stores an exercise performed during a completed workout
- `CompletedSet` — stores the weight and repetitions completed for an individual set

I separated planned workouts from completed workouts so that the program can preserve the original workout structure while separately recording what the user actually performed.

## What I'm Learning

This project has given me experience with:

- Object-oriented programming in Java
- Class design and composition
- Object references
- Encapsulation
- ArrayLists and collections
- User input and program flow
- Debugging
- Git and GitHub

As my first project, one of my main goals with this project is to learn how the different pieces of a larger software application fit together rather than only practicing programming concepts individually.

## Roadmap

My long-term goal is to turn the current Java program into a full-stack application.

Some features and technologies I plan to explore include:

- Persistent data storage
- SQL and relational databases
- Backend development and APIs
- A web-based frontend
- User accounts and authentication
- Deployment

The project is still actively being developed as I learn these technologies.
