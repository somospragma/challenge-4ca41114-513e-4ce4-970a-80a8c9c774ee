# Implementación de Gestión de Empleados con OOP

La empresa necesita un sistema para gestionar la información de sus empleados. Cada empleado tiene atributos como nombre, cargo, salario y departamento. El sistema debe permitir la creación, modificación y consulta de empleados. Además, se deben aplicar principios de Programación Orientada a Objetos como herencia, polimorfismo, encapsulamiento y abstracción para garantizar un diseño robusto y escalable.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Programación Orientada a Objetos |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 4-6 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición de Clases Base

**Objetivo:** Crear las clases base que representan a los empleados y sus atributos.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica los atributos comunes de todos los empleados.
- Define una clase base que encapsule estos atributos.

**Entregable:** Clase base de Empleado con atributos y métodos getters y setters.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo los atributos se relacionan con el concepto de encapsulamiento.
- Considera cómo la clase base puede ser utilizada para crear diferentes tipos de empleados.

</details>

### Fase 2: Implementación de Herencia

**Objetivo:** Crear clases derivadas que hereden de la clase base y añadan atributos específicos.

**Tiempo estimado:** 1.5 horas

**Instrucciones:**

- Identifica diferentes tipos de empleados (por ejemplo, Gerente, Desarrollador, Asistente).
- Crea clases derivadas que hereden de la clase base y añadan atributos específicos para cada tipo de empleado.

**Entregable:** Clases derivadas para diferentes tipos de empleados que heredan de la clase base.

<details>
<summary>Pistas de conocimiento</summary>

- Reflexiona sobre cómo la herencia puede ser utilizada para reutilizar código.
- Considera los atributos específicos que cada tipo de empleado debe tener.

</details>

### Fase 3: Aplicación de Polimorfismo

**Objetivo:** Implementar métodos polimórficos para manejar diferentes tipos de empleados de manera uniforme.

**Tiempo estimado:** 1.5 horas

**Instrucciones:**

- Define un método en la clase base que pueda ser sobrescrito en las clases derivadas.
- Implementa el polimorfismo para que el método se comporte de manera diferente según el tipo de empleado.

**Entregable:** Método polimórfico en la clase base y su sobrescritura en las clases derivadas.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo el polimorfismo puede ser utilizado para manejar diferentes tipos de empleados de manera uniforme.
- Considera cómo puedes sobrescribir métodos en las clases derivadas para añadir comportamientos específicos.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la herencia en el contexto de este reto?
- **paraQueSirve**: ¿Para qué sirve el encapsulamiento en la clase base de Empleado?
- **comoSeUsa**: ¿Cómo se utiliza el polimorfismo para manejar diferentes tipos de empleados?

## Criterios de Evaluacion

- Definición de clase base con atributos y métodos getters y setters.
- Creación de clases derivadas que heredan de la clase base y añaden atributos específicos.
- Implementación de métodos polimórficos en la clase base y su sobrescritura en las clases derivadas.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
