# language: fr

Fonctionnalité: Suivi des fonctionnalités de mon application


As utilisateur d AGEX
In order to vérifier la traçabilité entre mes exigences
I want to savoir si toutes les ESG sont couvertes par 1 ESD


Scénario: Couverture des exigences Amont par Aval correct
	Soit les exigences amonts:
#		| ReqID |
		| ESG01 |
		| ESG02 |
		| ESG03 |
		| ESG04 |
		| ESG05 |
	Et les exigences avals:
#		| ReqID | ReqID-Amont |
		| ESD01 | ESG01 ESG04 |
		| ESD02 | ESG03 ESG02 |
		| ESD03 | ESG05       |
		| ESD04 | ESG04       |
		| ESD05 | ESG03       |
	Quand je compare ces deux listes
	Alors les exigences amonts sont correctement couvertes
	

Scénario: Couverture des exigences Amont par Aval avec une exigence Amont non couverte
	Soit les exigences amonts:
#		| ReqID |
		| ESG01 |
		| ESG02 |
		| ESG03 |
		| ESG04 |
		| ESG05 |
	Et les exigences avals:
#		| ReqID | ReqID-Amont |
		| ESD01 | ESG01 ESG04 |
		| ESD02 | ESG03 ESG02 |
		| ESD04 | ESG04       |
		| ESD05 | ESG03       |
	Quand je compare ces deux listes
	Alors les exigences amonts ne sont pas correctement couvertes	
	
Scénario: Couverture des exigences Amont par Aval avec une exigence Amont oublié
	Soit les exigences amonts:
#		| ReqID |
		| ESG01 |
		| ESG02 |
		| ESG03 |
		| ESG04 |
	Et les exigences avals:
#		| ReqID | ReqID-Amont |
		| ESD01 | ESG01 ESG04 |
		| ESD02 | ESG03 ESG02 |
		| ESD04 | ESG04 ESG05 |
		| ESD05 | ESG03       |
	Quand je compare ces deux listes
	Alors les exigences amonts ne sont pas correctement couvertes	