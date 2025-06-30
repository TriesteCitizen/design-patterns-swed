# Creational Patterns
## 1. Singleton Pattern
This pattern ensures that only one instance of a class is used. It needs global access through a method call, that instantiates its instance at its first call (lazy instantiation), or gets generated, when its class is loaded on the virtual machine (early instatiation). 
![Bildschirmfoto vom 2025-06-30 14-48-07](https://github.com/user-attachments/assets/0fa0a29f-65b6-435c-b3f8-25a0baf46db3)

### MySingleton: 
This is a Java-implementation of the Singleton design pattern with thread-safe instantiation through double-checked locking.

**🔒Why double-checked locking?**
- Saves performance through minimal synchronization
- volatile 
