# 🗺️ Feuille de Route : Projet IDM 2025-2026
## Suite de Modélisation et Validation de Circuits Électroniques

[cite_start]Ce document définit les étapes clés pour la réalisation de la suite logicielle dédiée aux systèmes embarqués critiques[cite: 1, 2, 3].

---

### 🟢 Phase 1 : Consolidation de la Syntaxe Abstraite (Terminé/En cours)
**Objectif :** Finaliser les méta-modèles Ecore basés sur les ébauches PlantUML.

* [cite_start]**Implémentation Ecore :** Transformer les fichiers `.wsd` en modèles `.ecore` réels dans Eclipse[cite: 56, 57].
* [cite_start]**Gestion des Références Croisées :** * Lier `Netlist` vers `Catalogue` (Instance -> Composant)[cite: 59, 61, 113].
    * [cite_start]Lier `Layout` vers `Netlist` (Emplacement -> Instance)[cite: 117].
* [cite_start]**Structuration des URI :** Assurer des namespaces distincts pour la maintenance et la séparation des préoccupations[cite: 58].

### 🔵 Phase 2 : Édition du Catalogue et DSL de Contraintes (F1)
**Objectif :** Permettre la création de bibliothèques de composants robustes.

* [cite_start]**Interface Catalogue :** Créer une interface ergonomique pour l'édition des métadonnées (nom, fabricant)[cite: 20, 25].
* [cite_start]**Modélisation Physique :** Implémenter la définition des empreintes (hauteur, largeur) et des pads associés aux ports[cite: 21, 22, 107, 108].
* [cite_start]**Langage de Contraintes (Xtext) :** Développer la syntaxe textuelle pour les règles logiques (Et, Ou, Non) et géométriques (distances, redondance)[cite: 23, 24, 120].

### 🟡 Phase 3 : Conception de la Netlist et Sirius (F2)
**Objectif :** Visualiser et connecter les composants logiquement.

* [cite_start]**Éditeur Graphique Sirius :** Réaliser un diagramme permettant de déposer des instances et de créer des connexions[cite: 26, 27].
* [cite_start]**Système de Commentaires :** Permettre l'annotation des composants ou du circuit global[cite: 28, 111].
* [cite_start]**Export BOM :** Développer une transformation de modèle vers texte pour générer la liste des composants (Bill of Materials)[cite: 29, 48].

### 🔴 Phase 4 : Layout et Placement Physique (F3)
**Objectif :** Disposer les éléments sur une carte réelle.

* [cite_start]**Gestion Multi-couches :** Implémenter la structure des boards avec couches internes et externes[cite: 31, 32].
* [cite_start]**Placement et Routage :** * Gérer les coordonnées cartésiennes sur les couches externes[cite: 33, 116].
    * [cite_start]Modéliser les pistes (polylignes) reliant les composants[cite: 33, 116].
* [cite_start]**Export Image :** Générer des fichiers SVG pour chaque couche pour la revue de design[cite: 35, 45].

### 🛡️ Phase 5 : Moteur de Validation et Cohérence
**Objectif :** Vérifier automatiquement le respect des contraintes métier.

* [cite_start]**Cohérence Layout/Netlist :** Vérifier que chaque piste physique correspond bien à une connexion logique de la netlist[cite: 34, 118].
* [cite_start]**Calculateur Géométrique :** Implémenter la vérification des distances minimales et des zones d'exclusion[cite: 34, 54].
* [cite_start]**Validation de Résilience :** Vérifier les contraintes de redondance pour les composants critiques[cite: 5, 24].

### 📋 Phase 6 : Finalisation et Livrables
**Objectif :** Préparer le rendu et la défense du projet.

* [cite_start]**Rédaction du Rapport :** Respecter les normes strictes (Serif 11pt, marges 3cm/2.5cm) et inclure les schémas Ecore commentés[cite: 69, 70, 71, 73].
* [cite_start]**Scénario de Démonstration :** Préparer un exemple original montrant le passage d'un circuit invalide à un circuit valide[cite: 78, 80, 93, 94].
* [cite_start]**Organisation Git :** Nettoyer la branche `main` et structurer les workspaces Eclipse[cite: 81, 88].

---
