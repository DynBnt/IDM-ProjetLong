# 🗺️ Feuille de Route : Projet IDM 2025-2026
## Suite de Modélisation et Validation de Circuits Électroniques

Ce document définit les étapes clés pour la réalisation de la suite logicielle dédiée aux systèmes embarqués critiques.

---

### 🟢 Phase 1 : Consolidation de la Syntaxe Abstraite (Terminé/En cours)
**Objectif :** Finaliser les méta-modèles Ecore basés sur les ébauches PlantUML.

* **Implémentation Ecore :** Transformer les fichiers `.wsd` en modèles `.ecore` réels dans Eclipse.
* **Gestion des Références Croisées :** * Lier `Netlist` vers `Catalogue` (Instance -> Composant).
    * Lier `Layout` vers `Netlist` (Emplacement -> Instance).
* **Structuration des URI :** Assurer des namespaces distincts pour la maintenance et la séparation des préoccupations.

### 🔵 Phase 2 : Édition du Catalogue et DSL de Contraintes (F1)
**Objectif :** Permettre la création de bibliothèques de composants robustes.

* **Interface Catalogue :** Créer une interface ergonomique pour l'édition des métadonnées (nom, fabricant).
* **Modélisation Physique :** Implémenter la définition des empreintes (hauteur, largeur) et des pads associés aux ports.
* **Langage de Contraintes (Xtext) :** Développer la syntaxe textuelle pour les règles logiques (Et, Ou, Non) et géométriques (distances, redondance).

### 🟡 Phase 3 : Conception de la Netlist et Sirius (F2)
**Objectif :** Visualiser et connecter les composants logiquement.

* **Éditeur Graphique Sirius :** Réaliser un diagramme permettant de déposer des instances et de créer des connexions.
* **Système de Commentaires :** Permettre l'annotation des composants ou du circuit global.
* **Export BOM :** Développer une transformation de modèle vers texte pour générer la liste des composants (Bill of Materials).

### 🔴 Phase 4 : Layout et Placement Physique (F3)
**Objectif :** Disposer les éléments sur une carte réelle.

* **Gestion Multi-couches :** Implémenter la structure des boards avec couches internes et externes.
* **Placement et Routage :** * Gérer les coordonnées cartésiennes sur les couches externes.
    * Modéliser les pistes (polylignes) reliant les composants.
* **Export Image :** Générer des fichiers SVG pour chaque couche pour la revue de design.

### 🛡️ Phase 5 : Moteur de Validation et Cohérence
**Objectif :** Vérifier automatiquement le respect des contraintes métier.

* **Cohérence Layout/Netlist :** Vérifier que chaque piste physique correspond bien à une connexion logique de la netlist.
* **Calculateur Géométrique :** Implémenter la vérification des distances minimales et des zones d'exclusion.
* **Validation de Résilience :** Vérifier les contraintes de redondance pour les composants critiques.

### 📋 Phase 6 : Finalisation et Livrables
**Objectif :** Préparer le rendu et la défense du projet.

* **Rédaction du Rapport :** Respecter les normes strictes (Serif 11pt, marges 3cm/2.5cm) et inclure les schémas Ecore commentés.
* **Scénario de Démonstration :** Préparer un exemple original montrant le passage d'un circuit invalide à un circuit valide.
* **Organisation Git :** Nettoyer la branche `main` et structurer les workspaces Eclipse.

---
