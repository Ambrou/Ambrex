# language: fr

Fonctionnalité: Configuration du plugin


En tant qu' utilisateur du plugin Ambrex
Je veux configurer mon système
Afin de définir les fichiers à analyser

Scénario: Configuration réussi du plugin
Soit une interface de configuration
Et le fichier amont est renseigné
Et le fichier aval est renseigné
Quand je sauvegarde la configuration
Alors la configuration est sauvé
Et l'interface du projet est affiché
	
Scénario: Configuration du plugin sans fichier amont
Soit une interface de configuration
Et le fichier amont n'est pas renseigné
Et le fichier aval est renseigné
Quand je sauvegarde la configuration
Alors la configuration n'est pas sauvé
Et un message d'erreur apparait "le fichier amont n'est pas renseigné"
	
Scénario: Configuration du plugin sans fichier aval
Soit une interface de configuration
Et le fichier amont est renseigné
Et le fichier aval n'est pas renseigné
Quand je sauvegarde la configuration
Alors la configuration n'est pas sauvé
Et un message d'erreur apparait "le fichier aval n'est pas renseigné"