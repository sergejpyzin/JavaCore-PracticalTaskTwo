## Урок 2. Данные и функции

1. #### Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
###### Решение:
            создано два метода с помощью методов .filter и .count класса Arrays, принимающие на вход массив целых чисел 
    и возвращающий целое число (количество положительных элементов массива):
                1. countEvensWithNull - если считать ноль положительным числом;
                2. countEvensWithoutNull - если считать ноль не положительным числом.

2. #### Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
###### Решение:
            создан метод diffMinMaxElements с помощью преобразование массива в поток данных, 
    нахождение минимального и максимального элементов, принимает на вход массив целых чисел, возвращает
    целое число (разница между максимальным и минимальным элементами).

3. #### Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
###### Решение:
            создан метод hasAdjacentZeros, принимающий на вход массив целых чисел и возвращающий булевое значение:
                - true - в случае если два соседних елемента массива равны 0;
                - false - в случае если два соседних элемента массива неравны 0.