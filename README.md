##  Simple Blockchain in Java

This is a basic implementation of a blockchain written in Java for educational purposes. It allows you to:

- Create blocks with custom data
- Chain them cryptographically using SHA-256
- Validate the integrity of the blockchain
- View the blockchain in JSON format


## Features

- Block chaining via `previousHash`
- Hashing with SHA-256
- Timestamping
- Blockchain validity check
- JSON output via [Gson](https://github.com/google/gson)


## Technologies Used

- Java (JDK 8 or later)
- Gson (for JSON pretty-printing)


##  Project Structure
Block_chain/

├── Block.java # Defines block structure and hashing

├── Main.java # CLI interface for adding data to the chain

└── Algo.java # Utility class for hashing


## How to Run

1. Clone the repo:

  git clone https://github.com/yawsf1/BlockChaine.git
  cd BlockChaine

2. Compile and run:

  javac *.java
  java Main

## Output:
[
 {
    "data": "Hello World",
    "hash": "6a58a7...",
    "previousHash": "0",
    "timeStamp": 1693759837461
  },
  {
    "data": "Another Block",
    "hash": "91cf11...",
    "previousHash": "6a58a7...",
    "timeStamp": 1693759838472
  }
]
