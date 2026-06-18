# Optimización de consultas en una API REST utilizando caché

La API REST de un sistema de gestión de inventario necesita mejorar su rendimiento en consultas frecuentes. El objetivo es implementar una estrategia de caché utilizando Redis para reducir el tiempo de respuesta y la carga en la base de datos.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Implementación de estrategias de caché con Redis |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 3-4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del problema y análisis de requisitos

**Objetivo:** Identificar las consultas que se beneficiarían más de la implementación de caché y definir los criterios de éxito.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Analiza las consultas más frecuentes en la API REST.
- Identifica cuáles de estas consultas pueden beneficiarse de la implementación de caché.
- Define los criterios de éxito para la implementación de la caché.

**Entregable:** Documento con las consultas seleccionadas y los criterios de éxito definidos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el impacto en el rendimiento y la carga de la base de datos.
- Piensa en la frecuencia y la criticidad de las consultas.

</details>

### Fase 2: Diseño de la estrategia de caché

**Objetivo:** Diseñar una estrategia de caché que aborde las consultas identificadas en la fase anterior.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Diseña una estrategia de caché para las consultas seleccionadas.
- Define cómo se almacenarán y recuperarán los datos en caché.
- Considera la política de expiración de los datos en caché.

**Entregable:** Documento con la estrategia de caché diseñada.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el tamaño y la frecuencia de actualización de los datos.
- Piensa en la política de expiración adecuada para cada tipo de dato.

</details>

### Fase 3: Implementación y validación de la estrategia de caché

**Objetivo:** Implementar la estrategia de caché diseñada y validar su funcionamiento.

**Tiempo estimado:** 1-2 horas

**Instrucciones:**

- Implementa la estrategia de caché en la API REST.
- Realiza pruebas para validar el funcionamiento de la caché.
- Mide el impacto en el rendimiento y la carga de la base de datos.

**Entregable:** Código implementado y resultados de las pruebas de validación.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza herramientas de monitoreo para medir el rendimiento.
- Realiza pruebas con diferentes volúmenes de datos.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una estrategia de caché y por qué es importante en una API REST?
- **paraQueSirve**: ¿Para qué sirve la implementación de caché en la API REST y cuáles son sus beneficios?
- **comoSeUsa**: ¿Cómo se implementa una estrategia de caché utilizando Redis y cuáles son los pasos a seguir?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar una estrategia de caché y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de una estrategia de caché y cómo se toman estas decisiones?

## Criterios de Evaluacion

- Identificar las consultas más frecuentes en la API REST.
- Definir los criterios de éxito para la implementación de la caché.
- Diseñar una estrategia de caché para las consultas seleccionadas.
- Implementar la estrategia de caché y validar su funcionamiento.
- Medir el impacto en el rendimiento y la carga de la base de datos.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
