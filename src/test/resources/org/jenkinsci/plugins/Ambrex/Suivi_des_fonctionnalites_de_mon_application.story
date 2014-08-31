Narrative:

As utilisateur d’AGEX
In order to vérifier la traçabilité entre mes exigences
I want to savoir si toutes les ESG sont couvertes par 1 ESD


Scenario: Erreur d'exigence amont sous couverte
Given the traders:
|name|rank|
|Larry|Stooge 3|
|Moe|Stooge 1|
|Curly|Stooge 2|
When Traders are subset to ".*y" by name
Then the traders returned are:
|name|rank|
|Larry|Stooge 3|
|Curly|Stooge 2|