CREATE TABLE `products` (
  `id` int(11) NOT NULL,
  `category` int(11) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `date` int(11) DEFAULT NULL,
  `favorite` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `time` int(11) DEFAULT NULL
) ;
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);
create sequence hibernate_sequence start with 100 increment by 1;

