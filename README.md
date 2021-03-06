# PlatformScienceTask
# Code Exercise

Our sales team has just struck a deal with Acme Inc. to become the exclusive provider for
routing their product shipments via 3rd party trucking fleets. The catch is that we can only route
one shipment to one driver per day.

Each day we get the list of shipment destinations that are available for us to offer to drivers in
our network. Fortunately our team of highly trained data scientists have developed a
mathematical model for determining which drivers are best suited to deliver each shipment.
With that hard work done, now all we have to do is implement a program that assigns each
shipment destination to a given driver while maximizing the total suitability of all shipments to
all drivers.

The top-secret algorithm is:

    ● If the length of the shipment's destination street name is even, the base suitability score
      (SS) is the number of vowels in the driver’s name multiplied by 1.5.
    ● If the length of the shipment's destination street name is odd, the base SS is the number
      of consonants in the driver’s name multiplied by 1.
    ● If the length of the shipment's destination street name shares any common factors
      (besides 1) with the length of the driver’s name, the SS is increased by 50% above the
      base SS.

Write an Android application using the attached json file as input that displays a list of drivers.
When one is selected from the list display the correct shipment destination to that driver in a
way that maximizes the total SS over the set of drivers. Each driver can only have one shipment
and each shipment can only be offered to one driver.


# Output
![ScreenShot](https://github.com/Nckatharotiya/PlatformScienceTask/blob/master/PlatformScienceTask.png)
