// Code generated by Wire protocol buffer compiler, do not edit.
// Source: proto3.simple.RecursiveList in simple.proto
import Foundation
import Wire

/**
 *  List
 */
public struct RecursiveList {

    /**
     *  Recursive reference for list
     */
    public var list: [RecursiveList]
    public var unknownFields: Data = .init()

    public init(list: [RecursiveList] = []) {
        self.list = list
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension RecursiveList : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension RecursiveList : Hashable {
}
#endif

extension RecursiveList : Proto3Codable {
    public init(from reader: ProtoReader) throws {
        var list: [RecursiveList] = []

        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            case 1: try reader.decode(into: &list)
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

        self.list = list
    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.encode(tag: 1, value: self.list)
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension RecursiveList : Codable {
    public enum CodingKeys : String, CodingKey {

        case list

    }
}
#endif
