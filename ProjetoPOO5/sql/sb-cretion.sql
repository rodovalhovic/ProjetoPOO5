/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Tiago
 * Created: 08/12/2018
 */

CREATE TABLE livro(
    idlivro INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    nome VARCHAR(64) NOT NULL,
    sinopse VARCHAR(300),
    autor VARCHAR(64) NOT NULL
);