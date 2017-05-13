# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table consejos (
  id                            bigint not null,
  tema                          varchar(255),
  consejo                       varchar(255),
  paciente_documento            bigint,
  constraint pk_consejos primary key (id)
);
create sequence ConsejoEntity;

create table mediciones (
  referencia                    bigint not null,
  estado                        varchar(255),
  frecuencia                    varchar(255),
  estres                        varchar(255),
  presion                       varchar(255),
  fecha                         date,
  paciente_documento            bigint,
  constraint pk_mediciones primary key (referencia)
);
create sequence MedicionEntity;

create table medico (
  id_medico                     bigint not null,
  nombre_medico                 varchar(255),
  especialidad_medico           varchar(255),
  descripcion_medico            varchar(255),
  email                         varchar(255),
  contrasena                    varchar(255),
  tipo                          varchar(255),
  constraint pk_medico primary key (id_medico)
);
create sequence MedicoEntity;

create table medico_paciente (
  medico_id_medico              bigint not null,
  paciente_documento            bigint not null,
  constraint pk_medico_paciente primary key (medico_id_medico,paciente_documento)
);

create table paciente (
  documento                     bigint not null,
  nombre                        varchar(255),
  tipo_sangre                   varchar(255),
  pais                          varchar(255),
  ciudad                        varchar(255),
  telefono                      bigint,
  celular                       bigint,
  tratamientos                  varchar(255),
  examenes                      varchar(255),
  email                         varchar(255),
  contrasena                    varchar(255),
  marcapasos                    varchar(255),
  constraint pk_paciente primary key (documento)
);
create sequence PacienteEntity;

create table paciente_medico (
  paciente_documento            bigint not null,
  medico_id_medico              bigint not null,
  constraint pk_paciente_medico primary key (paciente_documento,medico_id_medico)
);

create table registro (
  id                            bigint not null,
  sensor_id                     bigint,
  creado_a                      date,
  dato                          float,
  constraint pk_registro primary key (id)
);
create sequence RegistroEntity;

create table sensores (
  id                            bigint not null,
  paciente_documento            bigint,
  tipo                          integer,
  fecha_asignacion              varchar(255),
  constraint ck_sensores_tipo check (tipo in (0,1,2)),
  constraint pk_sensores primary key (id)
);
create sequence SensorEntity;

create table urgencia (
  id                            bigint not null,
  latitud                       bigint,
  longitud                      bigint,
  constraint pk_urgencia primary key (id)
);
create sequence UrgenciaEntity;

alter table consejos add constraint fk_consejos_paciente_documento foreign key (paciente_documento) references paciente (documento) on delete restrict on update restrict;
create index ix_consejos_paciente_documento on consejos (paciente_documento);

alter table mediciones add constraint fk_mediciones_paciente_documento foreign key (paciente_documento) references paciente (documento) on delete restrict on update restrict;
create index ix_mediciones_paciente_documento on mediciones (paciente_documento);

alter table medico_paciente add constraint fk_medico_paciente_medico foreign key (medico_id_medico) references medico (id_medico) on delete restrict on update restrict;
create index ix_medico_paciente_medico on medico_paciente (medico_id_medico);

alter table medico_paciente add constraint fk_medico_paciente_paciente foreign key (paciente_documento) references paciente (documento) on delete restrict on update restrict;
create index ix_medico_paciente_paciente on medico_paciente (paciente_documento);

alter table paciente_medico add constraint fk_paciente_medico_paciente foreign key (paciente_documento) references paciente (documento) on delete restrict on update restrict;
create index ix_paciente_medico_paciente on paciente_medico (paciente_documento);

alter table paciente_medico add constraint fk_paciente_medico_medico foreign key (medico_id_medico) references medico (id_medico) on delete restrict on update restrict;
create index ix_paciente_medico_medico on paciente_medico (medico_id_medico);

alter table registro add constraint fk_registro_sensor_id foreign key (sensor_id) references sensores (id) on delete restrict on update restrict;
create index ix_registro_sensor_id on registro (sensor_id);

alter table sensores add constraint fk_sensores_paciente_documento foreign key (paciente_documento) references paciente (documento) on delete restrict on update restrict;
create index ix_sensores_paciente_documento on sensores (paciente_documento);


# --- !Downs

alter table if exists consejos drop constraint if exists fk_consejos_paciente_documento;
drop index if exists ix_consejos_paciente_documento;

alter table if exists mediciones drop constraint if exists fk_mediciones_paciente_documento;
drop index if exists ix_mediciones_paciente_documento;

alter table if exists medico_paciente drop constraint if exists fk_medico_paciente_medico;
drop index if exists ix_medico_paciente_medico;

alter table if exists medico_paciente drop constraint if exists fk_medico_paciente_paciente;
drop index if exists ix_medico_paciente_paciente;

alter table if exists paciente_medico drop constraint if exists fk_paciente_medico_paciente;
drop index if exists ix_paciente_medico_paciente;

alter table if exists paciente_medico drop constraint if exists fk_paciente_medico_medico;
drop index if exists ix_paciente_medico_medico;

alter table if exists registro drop constraint if exists fk_registro_sensor_id;
drop index if exists ix_registro_sensor_id;

alter table if exists sensores drop constraint if exists fk_sensores_paciente_documento;
drop index if exists ix_sensores_paciente_documento;

drop table if exists consejos cascade;
drop sequence if exists ConsejoEntity;

drop table if exists mediciones cascade;
drop sequence if exists MedicionEntity;

drop table if exists medico cascade;
drop sequence if exists MedicoEntity;

drop table if exists medico_paciente cascade;

drop table if exists paciente cascade;
drop sequence if exists PacienteEntity;

drop table if exists paciente_medico cascade;

drop table if exists registro cascade;
drop sequence if exists RegistroEntity;

drop table if exists sensores cascade;
drop sequence if exists SensorEntity;

drop table if exists urgencia cascade;
drop sequence if exists UrgenciaEntity;