# PokemonApi
Application PokeApi
L'application PokeApi est une application android qui affiche une liste de Pkemon en utilisant l'API PokeAPI.
L'utilisateur peut cliquer sur un Pokemon pour obtenir plus d'informations sur celui-ci.

<h2>Fonctionnalités principales :</h2>
Affichage d'une liste de Pokémon avec leur nom et leur image.
Chargement de données supplémentaires à partir de l'API PokéAPI lors du défilement de la liste.
Affichage de détails sur un Pokémon sélectionné lorsqu'on clique dessus.

<h2>Technologies et bibliothèques :</h2>
Java : Langage de programmation pour le développement de l'application.
Android Studio : Environnement de développement intégré (IDE) pour le développement d'applications Android.
Retrofit : Bibliothèque pour effectuer des appels API et récupérer des données.
RecyclerView : Composant pour afficher une liste d'éléments de manière optimisée.
Glide : Bibliothèque pour charger et afficher des images.
Gson : Bibliothèque pour la sérialisation et la désérialisation des données JSON.

<h2>Structure de l'application :</h2>
<h3>L'application est composée principalement de deux fichiers Java :</h3>
MainActivity.java : Gère l'affichage de la liste des Pokémon dans une RecyclerView et la gestion des appels à l'API PokéAPI pour charger plus de Pokémon lors du défilement.
ListePokiAdapter.java : Adaptateur pour la RecyclerView, contenant une liste de Pokémon à afficher avec leur nom et leur image.

<h2>Conclusion</h2>
Cette application démontre comment utiliser Retrofit, RecyclerView et Glide pour récupérer, afficher et manipuler des données d'API dans une application Android. Elle permet d'afficher une liste de Pokémon et de consulter des informations détaillées sur chacun d'eux.
