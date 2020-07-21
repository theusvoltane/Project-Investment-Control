CREATE TABLE `tb_aplicacoes` (
  `id_aplicacao` int NOT NULL auto_increment,
  `numero_aplicacao` int NOT NULL unique,
  `nome_aplicacao` varchar(50) NOT NULL unique,
  PRIMARY KEY (`id_aplicacao`)
);

CREATE TABLE `tb_bancos` (
  `id_banco` int NOT NULL auto_increment,
  `nome_banco` varchar(50) NOT NULL,
  `agencia` int NOT NULL,
  `id_aplicacao` int NOT NULL,
  PRIMARY KEY (`id_banco`),
  KEY `fk_tb_bancos_id_aplicacao` (`id_aplicacao`),
  CONSTRAINT `fk_tb_bancos_id_aplicacao` FOREIGN KEY (`id_aplicacao`) REFERENCES `tb_aplicacoes` (`id_aplicacao`)
);

CREATE TABLE `tb_investimentos` (
  `id_investimento` int NOT NULL auto_increment,
  `id_banco` int not NULL,
  `valor_investido` int NOT NULL,
  PRIMARY KEY (`id_investimento`),
  KEY `fk_tb_investimentos_id_banco` (`id_banco`),
  CONSTRAINT `fk_tb_investimentos_id_banco` FOREIGN KEY (`id_banco`) REFERENCES `tb_bancos` (`id_banco`)
) 