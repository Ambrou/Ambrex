# language: fr

Fonctionnalité: chargement de fichier ambrex


As utilisateur d Ambrex
In order to comparer deux niveaux d'exigence
I want to charger les exigences venant d'un fichier


Scénario: Chargement d'exigence amont
	Soit le fichier ESG.agex contenant les exigences amonts
	Quand je charge le fichier d'exigence amont en mémoire
	Alors la liste des exigences amonts est: 
		| ESG-001 |
		| ESG-002 |

Scénario: Chargement d'exigence aval
	Soit le fichier ESD.agex contenant les exigences avales
	Quand je charge le fichier d'exigence aval en mémoire
	Alors la liste des exigences avales est:
		| ESD-001 | ESG-001         |
		| ESD-002 | ESG-001         |
		| ESD-003 | ESG-001         |
		| ESD-004 | ESG-001 ESG-002 |