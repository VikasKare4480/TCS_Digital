import math

def getFare(source, destination):

    route = [ ['TH', 'GA', 'TC', 'HA', 'TE', 'LU', 'NI', 'CA'], [800, 600, 750, 900, 1400, 1200, 1100, 1500]]


    if not (source in route[0] and destination in route[0]):
        print('Invalid inputs')
        exit()


source = input('Enter the Source')

destination = input('Enter the destination')

print('Fare is {}'.format(getFare(source, destination)))


    