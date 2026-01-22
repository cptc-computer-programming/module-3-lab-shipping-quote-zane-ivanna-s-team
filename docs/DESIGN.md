# Shipping Quote Calculator
Adding random words to this document :)
## Cost Formula

Write your cost formula (math or pseudocode). It must include:
- at least one weight-based factor
- at least one size-based factor

```java 
// formula could go here
```
Size factor selected (choose at least one):

- surface area: 2(lw + lh + wh)
- density: weight / volume


Brief justification (2–4 sentences):

--- We chose density and surface area because we don't have to deal with complexity of other options.
Also, we decided to chose two methods to give us a little more of a challenge.

## Method List (at least 5)

For each method, keep it short. Include only:
- description (1 sentence)
- inputs (short list)
- output (what it returns)
- return type

Method 1: getDensity
- description: calculate the density of the object and determine if it's above a certain density
- inputs: wight, volume
- output: Density
- return type: boolean

Method 2: getSurfaceArea
- description: calculate the objects surface area
- inputs: width, height, weight
- output: SurfaceArea
- return type: int

Method 3: finalCost
- description: calculate the final shipping cost
- inputs: densityCost, surfaceAreaCost
- output: finalCost
- return type: double

Method 4: getDensityCost
- description: calculate the total cost in density
- inputs: getDensity
- output: densityCost
- return type: double

Method 5: getSurfaceAreaCost
- description: calculate the total cost in Surface Area
- inputs: getSurfaceArea
- output: surfaceAreaCost
- return type: double
