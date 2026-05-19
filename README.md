# Examen - Recursión y Divide y Vencerás

## Descripción
Este repositorio contiene la solución de 3 problemas utilizando técnicas de:

- Recursión
- Divide y vencerás
- Análisis de recurrencias
- Complejidad temporal Big O

Lenguaje utilizado:

- Java

---

# Problema 1: Verificar si un arreglo está ordenado

## Descripción
Determinar de forma recursiva si un arreglo está ordenado de menor a mayor.

## Ejemplo

Entrada:

```java
[1,2,3,5,8]
```

Salida:

```java
true
```

Entrada:

```java
[1,4,2,8]
```

Salida:

```java
false
```

## Caso base
Cuando se llega al último índice:

```java
if(i == arr.length - 1)
```

## Recurrencia

\[
T(n)=T(n-1)+c
\]

## Complejidad

\[
O(n)
\]

---

# Problema 2: Segundo elemento más grande usando Divide y Vencerás

## Descripción
Encontrar el segundo elemento más grande de un arreglo usando divide y vencerás.

## Ejemplo

Entrada:

```java
[8,3,10,5,7]
```

Salida:

```java
8
```

## Casos base
- Un elemento
- Dos elementos

## Recurrencia

\[
T(n)=2T(n/2)+c
\]

## Complejidad

\[
O(n)
\]

---

# Problema 3: Contar inversiones en un arreglo

## Descripción
Contar el número total de inversiones de un arreglo.

Una inversión ocurre cuando:

\[
i<j \quad y \quad arr[i] > arr[j]
\]

## Ejemplo

Entrada:

```java
[3,1,2]
```

Inversiones:

```java
(3,1)
(3,2)
```

Salida:

```java
2
```

## Recurrencia

\[
T(n)=2T(n/2)+n
\]

## Complejidad

\[
O(n \log n)
\]

---

# Resumen de complejidades

| Problema | Recurrencia | Big O |
|----------|------------|-------|
| Problema 1 | T(n)=T(n-1)+c | O(n) |
| Problema 2 | T(n)=2T(n/2)+c | O(n) |
| Problema 3 | T(n)=2T(n/2)+n | O(n log n) |

---

# Archivos

```bash
Problema1.java
Problema1.class
Problema2.java
Problema2.class
Problema3.java
Problema3.class
CopiaRÚBRICA_EXAMEN_PARCIAL_2026-1_KarloAyala
CopiaEXAMEN_PARCIAL_KarloAyala
README.md
```
## ESPECIAL COLABORATORS OF README: CHAD GPT
# THANKS TO HIM/HER … IT?