# Organização com Pacotes

## Por que usar pacotes?

### Pacotes ajudam a organizar o código e controlam quem pode acessar o quê.

	* Criamos dois pacotes:
		*	clientes: para as classes filhas(WhatsApp, Telegram, etc.).
		*	apps: para o uso do sistema de mensagens.
	* Colocamos os métodos protected na classe mãe, assim só as classes filhas dentro dos pacotes clientes ou apps podem acessá-los. Isso aumenta a segurança e evita que outros sistemas interfiram no funcionamento.