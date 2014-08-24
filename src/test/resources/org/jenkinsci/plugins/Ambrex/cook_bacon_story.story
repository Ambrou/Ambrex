Narrative:
 
In order to learn how to use JBehave better
As a developer of some middling-level of competence
I want to write some example stories about cooking bacon



Scenario: Erreur d'exigence amont sous couverte
Given le fichier amont fichier-ESG.agex contenant:
  | reqID | titre | ver | exigenceAmont                     | categorie      | criticite     | impact | stabilite  | verif  | texte     | commentaire    | statut  | dateStatut  |
  | ESG01 |   t1  |  0  | Feature_1222 (T) Feature_5222 (P) | Maintenabilité | Indispensable | Faible | Importante | Tests  | blablabla |                | Validée | 18/06/2014  |
  | ESG02 |   t1  |  0  | Feature_1422 (P) Feature_1232 (T) | Maintenabilité | Indispensable | Faible | Importante | Tests  | blablabla |                | Validée | 18/06/2014  |
  | ESG03 |   t1  |  0  | Feature_1422 (P)                  | Maintenabilité | Indispensable | Faible | Importante | Tests  | blablabla |                | Validée | 18/06/2014  |
  | ESG04 |   t1  |  0  | Feature_1422 (P)                  | Maintenabilité | Indispensable | Faible | Importante | Tests  | blablabla |                | Validée | 18/06/2014  |
  | ESG05 |   t1  |  0  | Feature_5222 (P)                  | Maintenabilité | Indispensable | Faible | Importante | Tests  | blablabla |                | Validée | 18/06/2014  |
Given le fichier aval fichier-ESD.agex contenant:
  | reqID | titre | ver | exigenceAmont       | categorie      | criticite     | impact | stabilite  | verif  | texte     | commentaire    | statut  | dateStatut  |
  | ESD01 |   t1  |  0  | ESG01 (P) ESG04 (P) | Maintenabilité | Indispensable | Faible | Importante | Tests  | blablabla |                | Validée | 18/06/2014  |
  | ESD02 |   t1  |  0  | ESG03 (P) ESG02 (P) | Maintenabilité | Indispensable | Faible | Importante | Tests  | blablabla |                | Validée | 18/06/2014  |
  | ESD03 |   t1  |  0  | ESG05 (T)           | Maintenabilité | Indispensable | Faible | Importante | Tests  | blablabla |                | Validée | 18/06/2014  |
  | ESD04 |   t1  |  0  | ESG04 (P)           | Maintenabilité | Indispensable | Faible | Importante | Tests  | blablabla |                | Validée | 18/06/2014  |
  | ESD05 |   t1  |  0  | ESG03 (P)           | Maintenabilité | Indispensable | Faible | Importante | Tests  | blablabla |                | Validée | 18/06/2014  |
When le plugin analyse ces deux fichiers
Then le build est en erreur
Given l'erreur sont:
  | Erreur                                 |
  | Exigence ESG01 sous couverte par ESD01 |
  | Exigence ESG02 sous couverte par ESD02 |
  
 
Scenario: Cooking bacon in a frypan
Given 12 strips of bacon
And a frypan on a medium heat
When I put the bacon into the frypan
And wait for 10 minutes or until the bacon sizzles
And flip the bacon
And wait for 5 minutes
Then I get perfectly cooked crispy bacon