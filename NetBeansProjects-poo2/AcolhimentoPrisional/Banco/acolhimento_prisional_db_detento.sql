-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: acolhimento_prisional_db
-- ------------------------------------------------------
-- Server version	8.0.42

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `detento`
--

DROP TABLE IF EXISTS `detento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `responsavel_atendimento` varchar(255) DEFAULT NULL,
  `data_entrada` varchar(255) DEFAULT NULL,
  `data_atendimento` varchar(255) DEFAULT NULL,
  `procedencia_transferencia` varchar(255) DEFAULT NULL,
  `nome_completo` varchar(255) DEFAULT NULL,
  `nome_social` varchar(255) DEFAULT NULL,
  `data_nascimento` varchar(255) DEFAULT NULL,
  `idade` int DEFAULT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `nacionalidade` varchar(255) DEFAULT NULL,
  `pais_origem` varchar(255) DEFAULT NULL,
  `nome_mae` varchar(255) DEFAULT NULL,
  `estado_civil` varchar(255) DEFAULT NULL,
  `etnia` varchar(255) DEFAULT NULL,
  `sexo_biologico` varchar(255) DEFAULT NULL,
  `identidade_de_genero` varchar(255) DEFAULT NULL,
  `orientacao_sexual` varchar(255) DEFAULT NULL,
  `escolaridade` varchar(255) DEFAULT NULL,
  `profissao` varchar(255) DEFAULT NULL,
  `beneficio_familiar` varchar(255) DEFAULT NULL,
  `quant_filhos` int DEFAULT NULL,
  `quant_dependentes` int DEFAULT NULL,
  `encaminhamento_neeja` tinyint(1) DEFAULT NULL,
  `conversa_assit_social` tinyint(1) DEFAULT NULL,
  `deficiencia` varchar(255) DEFAULT NULL,
  `intolerancia_alimentar` varchar(255) DEFAULT NULL,
  `cirurgias` varchar(255) DEFAULT NULL,
  `condicoes_cronicas` varchar(255) DEFAULT NULL,
  `doencas_infecciosas` varchar(255) DEFAULT NULL,
  `doenca_de_pele` varchar(255) DEFAULT NULL,
  `autoimune` varchar(255) DEFAULT NULL,
  `hepatite_b` varchar(255) DEFAULT NULL,
  `hepatite_c` varchar(255) DEFAULT NULL,
  `medicamento_continuo` varchar(255) DEFAULT NULL,
  `tipo_sanguineo` varchar(255) DEFAULT NULL,
  `idade_gestacional` int DEFAULT NULL,
  `metodo_contraceptivo` varchar(255) DEFAULT NULL,
  `exame_preventivo` varchar(255) DEFAULT NULL,
  `continuidade_contraceptivo` tinyint(1) DEFAULT NULL,
  `consulta_exame_preventivo` tinyint(1) DEFAULT NULL,
  `encaminhamento_pre_natal` tinyint(1) DEFAULT NULL,
  `ano_exame_cancer_prostata` int DEFAULT NULL,
  `familiar_historico_cancer_prostata` varchar(255) DEFAULT NULL,
  `vasectomia` tinyint(1) DEFAULT NULL,
  `parceira_gestante` tinyint(1) DEFAULT NULL,
  `participacao_pre_natal` tinyint(1) DEFAULT NULL,
  `encaminhamento_vasectomia` tinyint(1) DEFAULT NULL,
  `encaminhamento_pre_natal_parceira` tinyint(1) DEFAULT NULL,
  `vinculo_caps` varchar(255) DEFAULT NULL,
  `transtornos_mentais` varchar(255) DEFAULT NULL,
  `acompanhamento_saude_mental` varchar(255) DEFAULT NULL,
  `uso_drogas` varchar(255) DEFAULT NULL,
  `realizou_tratamento_para_uso` varchar(255) DEFAULT NULL,
  `deseja_realizar_tratamento_para_uso` varchar(255) DEFAULT NULL,
  `consulta_psicologia` tinyint(1) DEFAULT NULL,
  `consulta_psiquiatria` tinyint(1) DEFAULT NULL,
  `encaminhamento_renovacao_receita` tinyint(1) DEFAULT NULL,
  `encaminhamento_grupo_de_apoio` tinyint(1) DEFAULT NULL,
  `recebeu_vacina_covid` tinyint(1) DEFAULT NULL,
  `recebeu_vacina_influenza` tinyint(1) DEFAULT NULL,
  `recebeu_vacina_tetano` tinyint(1) DEFAULT NULL,
  `recebeu_vacina_hepatite_b` tinyint(1) DEFAULT NULL,
  `vacinas_a_ofertar` varchar(255) DEFAULT NULL,
  `copia_carteira_vacinacao` tinyint(1) DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `altura` float DEFAULT NULL,
  `imc` float DEFAULT NULL,
  `pa` varchar(255) DEFAULT NULL,
  `fc` float DEFAULT NULL,
  `sat` float DEFAULT NULL,
  `temp` float DEFAULT NULL,
  `sintomas` varchar(255) DEFAULT NULL,
  `data_sintomas` varchar(255) DEFAULT NULL,
  `lesoes` varchar(255) DEFAULT NULL,
  `conduta` varchar(255) DEFAULT NULL,
  `teste_hiv1_2` varchar(255) DEFAULT NULL,
  `teste_hiv2_2` varchar(255) DEFAULT NULL,
  `teste_sifilis` varchar(255) DEFAULT NULL,
  `teste_hepatite_b` varchar(255) DEFAULT NULL,
  `teste_hepatite_c` varchar(255) DEFAULT NULL,
  `teste_covid` varchar(255) DEFAULT NULL,
  `teste_gravidez` varchar(255) DEFAULT NULL,
  `coleta_escarro` tinyint(1) DEFAULT NULL,
  `queixa` varchar(255) DEFAULT NULL,
  `conduta_queixa` varchar(255) DEFAULT NULL,
  `queixa_odontologica` varchar(255) DEFAULT NULL,
  `avaliacao_imediata_dentista` tinyint(1) DEFAULT NULL,
  `conduta_dentista` varchar(255) DEFAULT NULL,
  `encaminhamentos_finais` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detento`
--

LOCK TABLES `detento` WRITE;
/*!40000 ALTER TABLE `detento` DISABLE KEYS */;
/*!40000 ALTER TABLE `detento` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-07-15 20:01:31
