-- phpMyAdmin SQL Dump
-- version 4.9.7
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost:8889
-- Généré le : mer. 22 juin 2022 à 12:22
-- Version du serveur :  5.7.32
-- Version de PHP : 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de données : `tpDal`
--

-- --------------------------------------------------------

--
-- Structure de la table `auteur`
--

CREATE TABLE `auteur` (
  `id` bigint(20) NOT NULL,
  `nom` varchar(25) NOT NULL,
  `prenom` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `auteur`
--

INSERT INTO `auteur` (`id`, `nom`, `prenom`) VALUES
(1, 'Doe', 'John'),
(2, 'Dote', 'Jane');

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

CREATE TABLE `produit` (
  `idProduit` bigint(20) NOT NULL,
  `refProd` int(11) DEFAULT NULL,
  `libelle` varchar(50) DEFAULT NULL,
  `marque` varchar(25) DEFAULT NULL,
  `prixUnitaire` double DEFAULT NULL,
  `qteStock` int(11) DEFAULT NULL,
  `parfum` varchar(25) DEFAULT NULL,
  `temperatureConservation` int(11) DEFAULT NULL,
  `poids` int(11) DEFAULT NULL,
  `couleur` varchar(15) DEFAULT NULL,
  `typeMine` varchar(20) DEFAULT NULL,
  `dateLimiteConso` date DEFAULT NULL,
  `idAuteur` bigint(20) DEFAULT NULL,
  `typeCarte` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `produit`
--

INSERT INTO `produit` (`idProduit`, `refProd`, `libelle`, `marque`, `prixUnitaire`, `qteStock`, `parfum`, 
`temperatureConservation`, `poids`, `couleur`, `typeMine`, `dateLimiteConso`, `idAuteur`, `typeCarte`) VALUES
(1, 115454, 'Stylo bic', 'Bic', 10, 100, NULL, NULL, NULL, 'rouge', 'Bille', NULL, NULL, NULL),
(2, 0, 'Baguette', 'Boulangerie Paul', 2, 360, NULL, NULL, 400, NULL, NULL, NULL, NULL, NULL),
(3, 121541, 'Glace au chocolat', 'Miko', 4, 60, 'Chocolat', -18, NULL, NULL, NULL, '2020-12-31', NULL, NULL),
(4, 0, 'Prioritaire', 'Carte Verte', 3, 23, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Paysage');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `auteur`
--
ALTER TABLE `auteur`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `produit`
--
ALTER TABLE `produit`
  ADD PRIMARY KEY (`idProduit`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `auteur`
--
ALTER TABLE `auteur`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `produit`
--
ALTER TABLE `produit`
  MODIFY `idProduit` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

