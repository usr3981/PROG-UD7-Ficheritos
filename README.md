# PROG-UD7-Ficheritos

## ✨ Descripción del proyecto

Este repositorio contiene las actividades desarrolladas durante la unidad didáctica 7 (UD7) de Programación, centradas en el manejo de ficheros en Java. A través de distintas prácticas, se aplican los conocimientos relacionados con operaciones de entrada y salida de información utilizando tanto la consola como ficheros, y se experimenta con distintos métodos de acceso al contenido almacenado.

---

## 🎯 Resultados de aprendizaje

A lo largo de este proyecto, se han trabajado los siguientes resultados:

- 🔹 Se han realizado operaciones de entrada y salida utilizando la consola.
- 🔹 Se han aplicado formatos personalizados para la visualización de datos.
- 🔹 Se ha trabajado con ficheros de texto para guardar y recuperar información.
- 🔹 Se han desarrollado programas que manejan distintos métodos de acceso a ficheros.
- 🔹 Se ha puesto en práctica el trabajo con ramas en Git y la documentación adecuada del flujo de trabajo.

---

## 🧩 Actividades realizadas

### 🔸 Actividad 0: Estructura del proyecto

- Se crea el proyecto `PROG-UD7-Ficheritos`.
- Se enlaza a un repositorio remoto público en GitHub.
- Se organiza el proyecto en paquetes por actividad.
- Se sigue una estructura de ramas por cada actividad con commits significativos.

---

### 🔸 Actividad 1: Guardado de texto en un fichero

- Se solicita al usuario un texto de al menos 30 caracteres.
- Se valida la longitud, se formatea el texto a mayúsculas y se reemplazan espacios por guiones bajos (`_`).
- El texto resultante se guarda en un fichero.

---

### 🔸 Actividad 2: Recuperación de texto en un fichero

- Se escribe un texto en un fichero.
- Se accede a su contenido y se muestra carácter a carácter junto con su código ASCII decimal.
  - Ejemplo de salida: `H_72, o_111, l_108, a_97`

---

### 🔸 Actividad 3: Fusionar contenido de varios ficheros

- Se fusiona el contenido de los ficheros generados en las actividades 1 y 2.
- El nuevo fichero sigue la siguiente estructura:
  Contenido del Fichero Uno: <...>

Contenido del Fichero Dos: <...>

- Se añade una línea de firma final.

---

### 🔸 Actividad 4: Persistencia y recuperación de objetos

- Se crea un fichero para almacenar objetos de tipo `Table`.
- Se desarrolla la clase `Table` con los atributos:
- `color` (String)
- `numeroPatas` (int)
- Se sobreescribe el método `toString()` para representar el objeto de forma formateada.
- Se desarrolla una clase de utilidad con dos métodos principales:
- `saveTable(Table)` – Guarda una nueva mesa en el fichero.
- `getTables` – Devuelve una lista con todas las mesas almacenadas.
- En la clase principal se implementa un menú que permite:
- Crear una nueva mesa solicitando datos por consola.
- Mostrar todas las mesas almacenadas en el fichero.
