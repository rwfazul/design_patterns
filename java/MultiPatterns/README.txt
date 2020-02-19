- Documentação usando Doxygen pode ser encontrada em 'docs/index.html';
- Diagramas de Casos de Uso, Classes e Sequência, além do projeto Astah, podem ser encontrados em 'diagramas';
- Projeto Java (Eclipse) está localizado em 'code'.

* Padrões de Projeto utilizados:
	1. Abstract Factory.
	2. Singleton;
	3. Factory Method;
	4. Bridge;
	5. Composite;
	6. Facade.

* Casos de Uso:
1. Manipula sistema de arquivos: inserção, deleção e leitura da árvore de arquivos do sistema. Modelos estão localizados no pacote 'storage', onde é feita a implementação do Padrão de Projeto 'Composite';

2. Configura sistema operacional: permite definição do sistema de operacional a ser utilizado. Modelos estão localizados no pacote 'operational', onde é feita a implementação do Padrão de Projeto 'Factory Method';

3. Emite alertas: criação das janelas de alerta do sistema operacional. Modelos estão localizados no pacote 'visualization', onde é feita a implementação do Padrão de Projeto 'Bridge';

5. Gere unidades de processamento: manutenção das unidades de processamento (CPU e GPU). Modelos estão localizados no pacote 'processing', onde é feita a implementação dos Padrões de Projeto 'Abstract Factory' e 'Singleton'.

** Toda manipulação dos elementos do sistema passam por uma das subclasses implementadas a partir do Padrão de Projeto 'Facade'.
