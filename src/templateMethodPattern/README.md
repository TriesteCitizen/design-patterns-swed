# Behavioral Patterns
## 1. Template Method Pattern
![Bildschirmfoto vom 2025-06-30 15-34-32](https://github.com/user-attachments/assets/19c691fe-af4e-4dd0-bf2a-9e3f5b083aa8)


At first we define a specific algorithm that can partly be executed by the abstract class itself, other parts get executed by the subclasses, that implement the non-abstact parts. The algorithm gets described in the final method, the abstract method of the superclass. The subclass(es) overwrite the abstract methods of the superclass. Optionally hook methods can be overwritten. Hook methods allow us to vary the algorithm.

![Bildschirmfoto vom 2025-06-30 16-10-20](https://github.com/user-attachments/assets/31a86b73-a0e1-40b9-b45e-36e79a8c4ca9)
