# Discrete Distribution Generator

## Description

This code generates random numbers using different probabilities to simulate random events with varying chances of happening. It's a useful tool for assigning probabilities or "luck" to different categories in games or simulations.

## Getting Started

```shell
# Clone the repository:
git clone https://github.com/apostoliadel/DiscreteDistribution.git

# Compile the code:
javac DiscreteDistribution.java

# Run the code:
java DiscreteDistribution <numRandomNumbers> <probabilities...>
```

## How to Use

To use this code, you need to provide two command-line arguments:

1. `numRandomNumbers`: The number of random numbers you want to generate.
2. `probabilities`: An array of probabilities representing the chances of each number being generated.

For example, you can run the code with the following command:

```shell
java DiscreteDistribution 10 1 2 3 4
```

This will generate 10 random numbers using the given probabilities.

## How It Works

1. This code generates random numbers based on the different chances you give it.
2. It adds up the probabilities you provide. Think of it like combining all the chances into one big total.
3. Then, it generates random numbers and checks them against the total chances to see which group they belong to. It's like matching the numbers with the probabilities.
4. Finally, the code displays the groups to which the generated random numbers belong. It reveals the categories that each random number falls into.


## Possible Uses

Here are some examples of the stuff you can do with this code:

- **Game Development:** Use this code to assign different chances to winning, losing, or encountering certain elements in the game.
- **Simulations:** Create virtual scenarios resembling real-life situations, like weather or population growth.
- **Decision-making:** Simulate outcomes based on different chances to make better choices.
- **Education and Experiments:** You can use this code for fun experiments and see how various chances affect the outcomes. It's a great way to understand the world of probabilities and why they matter.

## About the Author

Name: Apostolia Delikosta

GitHub: [apostoliadel](https://github.com/apostoliadel)

Feel free to modify and adapt the content to fit your needs.
