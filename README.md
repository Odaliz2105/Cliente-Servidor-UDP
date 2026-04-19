# 🧮 Calculadora Distribuida UDP

Este proyecto implementa una **calculadora cliente-servidor** utilizando el protocolo **UDP en Java**, con una interfaz gráfica desarrollada en **JavaFX**.

---

## 📌 Descripción

El sistema está compuesto por dos aplicaciones independientes:

* 🟩 **ServidorUDP**: procesa las operaciones matemáticas.
* 🟦 **ClienteUDP**: interfaz gráfica que permite al usuario ingresar datos y enviar solicitudes al servidor.

La comunicación se realiza mediante **DatagramSocket (UDP)**, enviando los datos como texto y recibiendo el resultado.

---

## 🧠 ¿Cómo funciona?

1. El usuario ingresa dos números en la interfaz.
2. Selecciona una operación (suma, resta, multiplicación o división).
3. El cliente envía los datos al servidor en formato:

```text
n1,n2,operacion
```

Ejemplo:

```text
10,5,+
```

4. El servidor procesa la operación.
5. El resultado es enviado de vuelta al cliente.
6. La interfaz muestra el resultado.

---

## 🏗️ Estructura del proyecto

```text
CalculadoraDistribuida/
 ├── ClienteUDP/
 │    ├── src/
 │    │    ├── entidades/
 │    │    ├── ventana/
 │    │    └── test/
 │
 ├── ServidorUDP/
 │    ├── src/
 │    │    ├── entidades/
 │    │    └── test/
 │
 └── README.md
```

---

## ⚙️ Tecnologías utilizadas

* Java
* JavaFX
* UDP (DatagramSocket / DatagramPacket)
* IntelliJ IDEA

---

## 🚀 Cómo ejecutar el proyecto

### 1️⃣ Ejecutar el servidor

Ir al proyecto `ServidorUDP` y ejecutar:

```text
TestServidor
```

Debe aparecer:

```text
Servidor corriendo en puerto: 5000
```

---

### 2️⃣ Ejecutar el cliente

Ir al proyecto `ClienteUDP` y ejecutar:

```text
MainApp
```

Se abrirá la interfaz gráfica.

---

## 🌐 Configuración de red

Si ejecutas cliente y servidor en la misma computadora, usar:

```java
127.0.0.1
```

Si están en diferentes máquinas, usar la IP del servidor.

---

## ⚠️ Manejo de errores

* División por cero retorna un mensaje de error.
* El servidor siempre responde para evitar bloqueos del cliente.

---

## 🎯 Funcionalidades

✔ Suma
✔ Resta
✔ Multiplicación
✔ División
✔ Interfaz gráfica
✔ Comunicación cliente-servidor

---

## 🧩 Conceptos aplicados

* Programación orientada a objetos (POO)
* Comunicación en red
* Arquitectura cliente-servidor
* Manejo de excepciones
* Serialización de datos (String → bytes)

---

## 📌 Autor

Proyecto desarrollado como práctica de **Aplicaciones Distribuidas**.

---

## 🔥 Notas

Este proyecto demuestra cómo dos aplicaciones independientes pueden comunicarse en red y trabajar juntas como un sistema distribuido.

---
