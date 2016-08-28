# Aula 01
# Aula 02
# Aula 03
# Aula 04

# Aula 08
-> Criar projeto com o banco de dados mysql
$ rails new appexample --database=mysql

-> Rodar o servidor em modo de produção
$ rails s -e production

-> Rake - Gerenciador de tarefas do ruby
-> Criando banco de dados no mysql
$ rake db:create


# Aula 09 

##Gerando o primeiro Scafold

rails generate scaffold {NomeDoModeloNoSingular} {campos:tipo}

EX=> rails generate scaffold customer nome:string email:string birthday:date obs:text


# Aula 10

## Migrate 

-> Arquivo com o nome do modelo -> Define como a tabela vai ser no banco de dados
-> Quando vc cria um modelo o rails por convencao cria uma chave primaria (ID) automaticamento
-> Também cria o campo TIMESTAMP que é criado 2 campos na tabela (created_at, updated_at)

-> Aplicar o modelo no banco de dados
$ rake db:migrate

-> Verificando no mysql a migração efetuada
$ mysql -u root -p
$ use appexample_development; --Dentro do Mysql
$ desc customers;

-> Utilizando o Scaffold
$ rails -s 
http://localhost:3000/customers 


# Aula 11


## eRuby
-> eRuby - Embeded Ruby - Ruby Imbutido no HTML
-> .erb -> arquivos Html com Ruby imubutido








