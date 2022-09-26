CREATE TABLE `agencia` (
  `id_agencia` int NOT NULL,
  `nome_agencia` int NOT NULL,
  `email_agencia` varchar(20) NOT NULL,
  `tel_agencia` varchar(11) NOT NULL,
  PRIMARY KEY (`id_agencia`)
) ;
CREATE TABLE `acesso` (
  `id_acesso` int NOT NULL,
  `tipo_acesso` varchar(20) NOT NULL,
  PRIMARY KEY (`id_acesso`)
);
CREATE TABLE `cliente` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `nome_cliente` varchar(30) DEFAULT NULL,
  `cpf_cliente` char(11) DEFAULT NULL,
  `email_cliente` varchar(30) DEFAULT NULL,
  `id_destino` int DEFAULT NULL,
  `data_viagem` date DEFAULT NULL,
  PRIMARY KEY (`id_cliente`),
  KEY `id_destino_idx` (`id_destino`),
  CONSTRAINT `id_destino` FOREIGN KEY (`id_destino`) REFERENCES `destino` (`id_destino`)
);
CREATE TABLE `compra` (
  `id_compra` int NOT NULL AUTO_INCREMENT,
  `id_cliente` int DEFAULT NULL,
  `data_compra` date DEFAULT NULL,
  PRIMARY KEY (`id_compra`),
  KEY `id_cliente_idx` (`id_cliente`),
  CONSTRAINT `id_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`)
);
CREATE TABLE `itens_compra` (
  `id_itens_compra` int NOT NULL,
  `qde_itens` int NOT NULL,
  `valor_itens` double NOT NULL,
  PRIMARY KEY (`id_itens_compra`)
);
CREATE TABLE `destino` (
  `id_destino` int NOT NULL AUTO_INCREMENT,
  `nome_destino` varchar(20) DEFAULT NULL,
  `valor_pacote` decimal(6,2) DEFAULT NULL,
  PRIMARY KEY (`id_destino`)
) ;
CREATE TABLE `funcionario` (
  `id_func` int NOT NULL AUTO_INCREMENT,
  `nome_func` varchar(30) DEFAULT NULL,
  `cpf_func` char(11) DEFAULT NULL,
  `email_func` varchar(30) DEFAULT NULL,
  `tel_func` char(13) DEFAULT NULL,
  `senha_func` char(6) DEFAULT NULL,
  PRIMARY KEY (`id_func`)
)



