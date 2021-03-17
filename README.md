# Workshop_Sqlite
A workshop to learn how to create a native sqlite database in Java


part 1 : intro
part 2 : explication architecture, création table, insertion
part 3 : création du player, mutexage, ajout d'une autre table

# Partie 1 : introduction
Bienvenu dans ce workshop sur le package natif sql de java. En effet ce package a l'avantage d'être "natif" ce qui veux dire qu'il ne nécéssite aucune installation supplémentaire pour être utilisé, il suffit de l'importer dans votre code come ceci.
 ```
 import java.sql.*;
 ```
 Dans la partie suivante nous allons couvrir :
 + La base des query SQL (création d'une table, ajout et retrait d'un élement d'une table)
 + Qu'est-ce qu'un singleton et un Builder et quel sont leurs intérêts

## La base des query SQL
Le langage SQL fonctionne différement des langages impératifs que vous avez l'habitude de manipuler. Ici on manipule le code a l'aide de "queries" qui permettent de demander a notre base de donnée d'effectuer un ordre que l'on spécifie.

![](images/image1.png)

 
 
