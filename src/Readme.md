										Hierarquia
```mermaid
flowchart LR

	ABS[Funcionario] --> |funcionario é a classe abstrata| f1[atendente]
	f1 --> f2[supervisor] 
	f2 --> f3[gerente] 
	f3 --> f4[CEO] 
```

Permições:

Atendente:
- tirar ferias
- fazer ligaçẽos
- agendar horarios



