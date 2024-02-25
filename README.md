# Projet Java - Gestion de DAO avec Spring 🌱
<p>
  <img alt="Version" src="https://img.shields.io/badge/version-1.0-blue.svg?cacheSeconds=2592000" />
  <a href="#" target="_blank">
    <img alt="License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" />
  </a>
</p>

Ce projet Java illustre un système de gestion de DAO (Data Access Object) en utilisant Spring Framework.

## Description ℹ️

Le projet se compose des éléments suivants :

- **dao** : Un package contenant l'interface `IDao` définissant une méthode `getData()`, ainsi que l'implémentation `DaoImpl` qui fournit des données à partir d'une base de données.
- **extension** : Un package contenant une autre implémentation de `IDao` nommée `DaoImplV2`, qui fournit des données via un service Web.
- **metier** : Un package contenant l'interface `IMetier` définissant une méthode `calcul()`, ainsi que l'implémentation `MetierImpl` qui utilise un DAO pour effectuer des calculs.
- **presentation** : Un package contenant différentes classes de présentation pour illustrer l'utilisation des fonctionnalités.
- **conf.xml** : Un fichier de configuration Spring XML qui définit les beans nécessaires et leurs dépendances.

## Fonctionnalités ⚙️

- Utilisation de l'inversion de contrôle (IoC) avec Spring pour gérer les dépendances.
- Implémentation de DAO avec deux versions pour récupérer des données.
- Utilisation de l'annotation `@Component` pour marquer les classes gérées par Spring.
- Utilisation des annotations `@Qualifier` et `@Autowired` pour injecter les dépendances correctes.
- Configuration du contexte Spring à l'aide de fichiers XML ou d'annotations.

## Exécution ▶️

Pour exécuter le projet, vous pouvez utiliser l'une des classes de présentation fournies :

- `presentation.Presentation` : Utilisation manuelle des classes de DAO et de métier.
- `presentation.Presentation_V2` : Lecture dynamique des classes à partir d'un fichier de configuration.
- `presentation.PresentationSpringAnnotation` : Utilisation de Spring avec des annotations.
- `presentation.PresentationSpringXML` : Utilisation de Spring avec un fichier de configuration XML.

Assurez-vous d'avoir les dépendances appropriées (Spring Framework) dans votre projet pour exécuter avec succès les différentes classes de présentation.

## Installation

```sh
git clone https://github.com/Dev7HD/IOC_TP1/
```

## Autheur

👤 **Hamza Damiri**

* Github: [@Dev7HD](https://github.com/Dev7HD)